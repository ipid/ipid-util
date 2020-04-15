/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public final class Tuple7<T0, T1, T2, T3, T4, T5, T6>
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