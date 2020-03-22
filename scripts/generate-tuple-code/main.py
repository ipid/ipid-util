from argparse import ArgumentParser
from pathlib import Path
from typing import Any, List

from jinja2 import Template

MAX_TUPLE = 26
REPEAT = 3

WRAPPER_TYPES = (['Byte', 'Short', 'Integer', 'Long', 'Float', 'Double', 'Character', 'Boolean', 'String'] * REPEAT)[
                :MAX_TUPLE]
SMALLER_VAL = ('''((byte) 0), ((short) 0), 0, 0L, 1.4f, 1.4, 'b', false, "abb"'''.split(', ') * REPEAT)[:MAX_TUPLE]
INIT_VAL = ('''((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc"'''.split(', ') * REPEAT)[:MAX_TUPLE]
GREATER_VAL = ('''((byte) 2), ((short) 2), 2, 2L, 1.6f, 1.6, 'd', true, "abd"'''.split(', ') * REPEAT)[:MAX_TUPLE]
assert len(INIT_VAL) == len(SMALLER_VAL) == len(GREATER_VAL) == len(WRAPPER_TYPES) == MAX_TUPLE


def joiner(a: str, start: int, end: int, sep: str = ', '):
    return sep.join(
        a.format(i) for i in range(start, end)
    )


def member_gen(start: int, end: int, sep: str = ', ') -> str:
    return sep.join(
        f'tX.{chr(97 + i)}' for i in range(start, end)
    )


def cjoin(l: List[str], s: str = ', '):
    return s.join(l)


def rep(l: list, index: int, to: Any):
    l = l[:]
    l[index] = to
    return l


def get_Tuple0():
    template = Template(Path(f'Tuple0.jinja').read_text(encoding='utf-8'))

    return template.render(
        num=0,
        uid=pow(70368760954879, 20, (1 << 62)),
        uplim=MAX_TUPLE,
        joiner=joiner,
    )


def get_TupleX(i):
    """
    获取 Tuple{i} 的代码
    :param i: TupleX 中的 X
    :return: Java 代码
    """
    if i == 0:
        return get_Tuple0()

    template = Template(Path('TupleX.jinja').read_text(encoding='utf-8'))
    return template.render(
        num=i,
        uplim=MAX_TUPLE,
        uid=pow(70368760954879, 20 + i, (1 << 62)),
        type=', '.join(f'T{x}' for x in range(i)),
        declares=', '.join(f'T{x} {chr(97 + x)}' for x in range(i)),
        args=', '.join(f'{chr(97 + x)}' for x in range(i)),
        null_checks=' || '.join(f'{chr(97 + x)} == null' for x in range(i)),
        questions=', '.join('?' for x in range(i)),
        static_type=', '.join(f'E{x}' for x in range(i)),
        static_declares=', '.join(f'E{x} {chr(97 + x)}' for x in range(i)),
        joiner=joiner,
        chr=chr,
        member_gen=member_gen,
        set_type=lambda num, s: ', '.join(f'T{x}' if x != s else 'E' for x in range(0, num)),
        set_elem=lambda num, s: ', '.join(chr(97 + x) if x != s else 'elem' for x in range(0, num))
    )


def get_TestTupleAll() -> str:
    template = Template(Path('TestTupleAll.jinja').read_text(encoding='utf-8'))
    return template.render(
        uplim=MAX_TUPLE,
        wrapper_types=WRAPPER_TYPES,
        init_val=INIT_VAL,
        cjoin=cjoin,
    )


def get_TestTupleX(num: int) -> str:
    template = Template(Path('TestTupleX.jinja').read_text(encoding='utf-8'))

    # smaller_val is guaranteed to be different, but greater_val isn't
    return template.render(
        num=num,
        uplim=MAX_TUPLE,
        wrapper_types=WRAPPER_TYPES,
        smaller_val=SMALLER_VAL,
        init_val=INIT_VAL,
        greater_val=GREATER_VAL,
        cjoin=cjoin,
        rep=rep,
        cjrep=lambda l, index, to: cjoin(rep(l, index, to)),
        chr=chr,
    )


def generate_java_files(root: Path):
    main_dir, test_dir = (root / 'main'), (root / 'test')
    main_dir.mkdir(exist_ok=True)
    test_dir.mkdir(exist_ok=True)

    print('Generating TestTupleAll.java')
    (test_dir / 'TestTupleAll.java').write_text(get_TestTupleAll())

    for i in range(0, MAX_TUPLE + 1):
        print('Tuple{}.java'.format(i))
        (main_dir / 'Tuple{}.java'.format(i)).write_text(get_TupleX(i))
        print('TestTuple{}.java'.format(i))
        (test_dir / 'TestTuple{}.java'.format(i)).write_text(get_TestTupleX(i))


def main():
    parser = ArgumentParser()
    parser.add_argument(
        '-r', '--root',
        type=str,
        help='Path where generated .java files store',
        metavar='<RootPath>',
        dest='root',
        required=True,
    )
    args = parser.parse_args()

    generate_java_files(Path(args.root))


if __name__ == '__main__':
    main()
