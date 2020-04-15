/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public final class Tuple8<T0, T1, T2, T3, T4, T5, T6, T7>
    extends Tupling
    implements Comparable<Tuple8<T0, T1, T2, T3, T4, T5, T6, T7>> {

    private static final long serialVersionUID = 104427215889891329L;
    public final T0 a;
    public final T1 b;
    public final T2 c;
    public final T3 d;
    public final T4 e;
    public final T5 f;
    public final T6 g;
    public final T7 h;

    public static <E0, E1, E2, E3, E4, E5, E6, E7> Tuple8<E0, E1, E2, E3, E4, E5, E6, E7> of(
            E0 a, E1 b, E2 c, E3 d, E4 e, E5 f, E6 g, E7 h) {
        return new Tuple8<>(
                a, b, c, d, e, f, g, h);
    }

    public Tuple8<T0, T1, T2, T3, T4, T5, T6, T7> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E> Tuple8<E, T1, T2, T3, T4, T5, T6, T7> setA(E elem) {
        return new Tuple8<>(elem, b, c, d, e, f, g, h);
    }

    public <E> Tuple8<T0, E, T2, T3, T4, T5, T6, T7> setB(E elem) {
        return new Tuple8<>(a, elem, c, d, e, f, g, h);
    }

    public <E> Tuple8<T0, T1, E, T3, T4, T5, T6, T7> setC(E elem) {
        return new Tuple8<>(a, b, elem, d, e, f, g, h);
    }

    public <E> Tuple8<T0, T1, T2, E, T4, T5, T6, T7> setD(E elem) {
        return new Tuple8<>(a, b, c, elem, e, f, g, h);
    }

    public <E> Tuple8<T0, T1, T2, T3, E, T5, T6, T7> setE(E elem) {
        return new Tuple8<>(a, b, c, d, elem, f, g, h);
    }

    public <E> Tuple8<T0, T1, T2, T3, T4, E, T6, T7> setF(E elem) {
        return new Tuple8<>(a, b, c, d, e, elem, g, h);
    }

    public <E> Tuple8<T0, T1, T2, T3, T4, T5, E, T7> setG(E elem) {
        return new Tuple8<>(a, b, c, d, e, f, elem, h);
    }

    public <E> Tuple8<T0, T1, T2, T3, T4, T5, T6, E> setH(E elem) {
        return new Tuple8<>(a, b, c, d, e, f, g, elem);
    }

    protected Tuple8(T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h) {
        this(
                a, b, c, d, e, f, g, h,
                new Object[]{a, b, c, d, e, f, g, h},
                true
        );
    }

    protected Tuple8(
            T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null || f == null || g == null || h == null
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
        this.h = h;
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

    public T7 getH() {
        return h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple8<?, ?, ?, ?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple8<?, ?, ?, ?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple8<T0, T1, T2, T3, T4, T5, T6, T7> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple8<T0, T1, T2, T3, T4, T5, T6, T7> clone() {
        return new Tuple8<>(
                a, b, c, d, e, f, g, h,
                valueList, false);
    }
}