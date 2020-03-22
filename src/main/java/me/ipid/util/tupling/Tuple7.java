/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple7<T0, T1, T2, T3, T4, T5, T6>
    extends Tupling
    implements Comparable<Tuple7<T0, T1, T2, T3, T4, T5, T6>> {

    private static final long serialVersionUID = 4514788258147729407L;
    public final T0 a;
    public final T1 b;
    public final T2 c;
    public final T3 d;
    public final T4 e;
    public final T5 f;
    public final T6 g;

    public static <E0, E1, E2, E3, E4, E5, E6> Tuple7<E0, E1, E2, E3, E4, E5, E6> of(
            E0 a, E1 b, E2 c, E3 d, E4 e, E5 f, E6 g) {
        return new Tuple7<>(
                a, b, c, d, e, f, g);
    }

    public Tuple7<T0, T1, T2, T3, T4, T5, T6> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E7> Tuple8<T0, T1, T2, T3, T4, T5, T6, E7> add(Tuple1<E7> tX) {
        nullCheckOfAdd(tX);
        return new Tuple8<>(a, b, c, d, e, f, g, tX.a);
    }

    public <E7, E8> Tuple9<T0, T1, T2, T3, T4, T5, T6, E7, E8> add(Tuple2<E7, E8> tX) {
        nullCheckOfAdd(tX);
        return new Tuple9<>(a, b, c, d, e, f, g, tX.a, tX.b);
    }

    public <E7, E8, E9> Tuple10<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9> add(Tuple3<E7, E8, E9> tX) {
        nullCheckOfAdd(tX);
        return new Tuple10<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c);
    }

    public <E7, E8, E9, E10> Tuple11<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10> add(Tuple4<E7, E8, E9, E10> tX) {
        nullCheckOfAdd(tX);
        return new Tuple11<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d);
    }

    public <E7, E8, E9, E10, E11> Tuple12<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11> add(Tuple5<E7, E8, E9, E10, E11> tX) {
        nullCheckOfAdd(tX);
        return new Tuple12<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E7, E8, E9, E10, E11, E12> Tuple13<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12> add(Tuple6<E7, E8, E9, E10, E11, E12> tX) {
        nullCheckOfAdd(tX);
        return new Tuple13<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f);
    }

    public <E7, E8, E9, E10, E11, E12, E13> Tuple14<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13> add(Tuple7<E7, E8, E9, E10, E11, E12, E13> tX) {
        nullCheckOfAdd(tX);
        return new Tuple14<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14> Tuple15<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14> add(Tuple8<E7, E8, E9, E10, E11, E12, E13, E14> tX) {
        nullCheckOfAdd(tX);
        return new Tuple15<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15> Tuple16<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15> add(Tuple9<E7, E8, E9, E10, E11, E12, E13, E14, E15> tX) {
        nullCheckOfAdd(tX);
        return new Tuple16<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> Tuple17<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> add(Tuple10<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> tX) {
        nullCheckOfAdd(tX);
        return new Tuple17<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> Tuple18<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> add(Tuple11<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> tX) {
        nullCheckOfAdd(tX);
        return new Tuple18<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> Tuple19<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> add(Tuple12<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> tX) {
        nullCheckOfAdd(tX);
        return new Tuple19<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> Tuple20<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> add(Tuple13<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> tX) {
        nullCheckOfAdd(tX);
        return new Tuple20<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> Tuple21<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> add(Tuple14<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> tX) {
        nullCheckOfAdd(tX);
        return new Tuple21<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> Tuple22<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> add(Tuple15<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> Tuple23<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> add(Tuple16<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> Tuple24<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> add(Tuple17<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> Tuple25<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> add(Tuple18<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r);
    }

    public <E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> Tuple26<T0, T1, T2, T3, T4, T5, T6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> add(Tuple19<E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, b, c, d, e, f, g, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s);
    }

    public <E> Tuple7<E, T1, T2, T3, T4, T5, T6> setA(E elem) {
        return new Tuple7<>(elem, b, c, d, e, f, g);
    }

    public <E> Tuple7<T0, E, T2, T3, T4, T5, T6> setB(E elem) {
        return new Tuple7<>(a, elem, c, d, e, f, g);
    }

    public <E> Tuple7<T0, T1, E, T3, T4, T5, T6> setC(E elem) {
        return new Tuple7<>(a, b, elem, d, e, f, g);
    }

    public <E> Tuple7<T0, T1, T2, E, T4, T5, T6> setD(E elem) {
        return new Tuple7<>(a, b, c, elem, e, f, g);
    }

    public <E> Tuple7<T0, T1, T2, T3, E, T5, T6> setE(E elem) {
        return new Tuple7<>(a, b, c, d, elem, f, g);
    }

    public <E> Tuple7<T0, T1, T2, T3, T4, E, T6> setF(E elem) {
        return new Tuple7<>(a, b, c, d, e, elem, g);
    }

    public <E> Tuple7<T0, T1, T2, T3, T4, T5, E> setG(E elem) {
        return new Tuple7<>(a, b, c, d, e, f, elem);
    }

    protected Tuple7(T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g) {
        this(
                a, b, c, d, e, f, g,
                new Object[]{a, b, c, d, e, f, g},
                true
        );
    }

    protected Tuple7(
            T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null || f == null || g == null
        )) {
            throw new NullPointerException("Elements of a tuple can't be null");
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.valueList = valueList;
    }

    public T0 getA() {
        return a;
    }

    public T1 getB() {
        return b;
    }

    public T2 getC() {
        return c;
    }

    public T3 getD() {
        return d;
    }

    public T4 getE() {
        return e;
    }

    public T5 getF() {
        return f;
    }

    public T6 getG() {
        return g;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple7<?, ?, ?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple7<?, ?, ?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple7<T0, T1, T2, T3, T4, T5, T6> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple7<T0, T1, T2, T3, T4, T5, T6> clone() {
        return new Tuple7<>(
                a, b, c, d, e, f, g,
                valueList, false);
    }
}