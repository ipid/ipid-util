/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple6<T0, T1, T2, T3, T4, T5>
    extends Tupling
    implements Comparable<Tuple6<T0, T1, T2, T3, T4, T5>> {

    private static final long serialVersionUID = 89649779646136321L;
    public final T0 a;
    public final T1 b;
    public final T2 c;
    public final T3 d;
    public final T4 e;
    public final T5 f;

    public static <E0, E1, E2, E3, E4, E5> Tuple6<E0, E1, E2, E3, E4, E5> of(
            E0 a, E1 b, E2 c, E3 d, E4 e, E5 f) {
        return new Tuple6<>(
                a, b, c, d, e, f);
    }

    public Tuple6<T0, T1, T2, T3, T4, T5> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E6> Tuple7<T0, T1, T2, T3, T4, T5, E6> add(Tuple1<E6> tX) {
        nullCheckOfAdd(tX);
        return new Tuple7<>(a, b, c, d, e, f, tX.a);
    }

    public <E6, E7> Tuple8<T0, T1, T2, T3, T4, T5, E6, E7> add(Tuple2<E6, E7> tX) {
        nullCheckOfAdd(tX);
        return new Tuple8<>(a, b, c, d, e, f, tX.a, tX.b);
    }

    public <E> Tuple6<E, T1, T2, T3, T4, T5> setA(E elem) {
        return new Tuple6<>(elem, b, c, d, e, f);
    }

    public <E> Tuple6<T0, E, T2, T3, T4, T5> setB(E elem) {
        return new Tuple6<>(a, elem, c, d, e, f);
    }

    public <E> Tuple6<T0, T1, E, T3, T4, T5> setC(E elem) {
        return new Tuple6<>(a, b, elem, d, e, f);
    }

    public <E> Tuple6<T0, T1, T2, E, T4, T5> setD(E elem) {
        return new Tuple6<>(a, b, c, elem, e, f);
    }

    public <E> Tuple6<T0, T1, T2, T3, E, T5> setE(E elem) {
        return new Tuple6<>(a, b, c, d, elem, f);
    }

    public <E> Tuple6<T0, T1, T2, T3, T4, E> setF(E elem) {
        return new Tuple6<>(a, b, c, d, e, elem);
    }

    protected Tuple6(T0 a, T1 b, T2 c, T3 d, T4 e, T5 f) {
        this(
                a, b, c, d, e, f,
                new Object[]{a, b, c, d, e, f},
                true
        );
    }

    protected Tuple6(
            T0 a, T1 b, T2 c, T3 d, T4 e, T5 f,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null || f == null
        )) {
            throw new NullPointerException("Elements of a tuple can't be null");
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple6<?, ?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple6<?, ?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple6<T0, T1, T2, T3, T4, T5> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple6<T0, T1, T2, T3, T4, T5> clone() {
        return new Tuple6<>(
                a, b, c, d, e, f,
                valueList, false);
    }
}