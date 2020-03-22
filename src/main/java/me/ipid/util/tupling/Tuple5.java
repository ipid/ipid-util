/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple5<T0, T1, T2, T3, T4>
    extends Tupling
    implements Comparable<Tuple5<T0, T1, T2, T3, T4>> {

    private static final long serialVersionUID = 4529002744438063103L;
    public final T0 a;
    public final T1 b;
    public final T2 c;
    public final T3 d;
    public final T4 e;

    public static <E0, E1, E2, E3, E4> Tuple5<E0, E1, E2, E3, E4> of(
            E0 a, E1 b, E2 c, E3 d, E4 e) {
        return new Tuple5<>(
                a, b, c, d, e);
    }

    public Tuple5<T0, T1, T2, T3, T4> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E5> Tuple6<T0, T1, T2, T3, T4, E5> add(Tuple1<E5> tX) {
        nullCheckOfAdd(tX);
        return new Tuple6<>(a, b, c, d, e, tX.a);
    }

    public <E5, E6> Tuple7<T0, T1, T2, T3, T4, E5, E6> add(Tuple2<E5, E6> tX) {
        nullCheckOfAdd(tX);
        return new Tuple7<>(a, b, c, d, e, tX.a, tX.b);
    }

    public <E5, E6, E7> Tuple8<T0, T1, T2, T3, T4, E5, E6, E7> add(Tuple3<E5, E6, E7> tX) {
        nullCheckOfAdd(tX);
        return new Tuple8<>(a, b, c, d, e, tX.a, tX.b, tX.c);
    }

    public <E> Tuple5<E, T1, T2, T3, T4> setA(E elem) {
        return new Tuple5<>(elem, b, c, d, e);
    }

    public <E> Tuple5<T0, E, T2, T3, T4> setB(E elem) {
        return new Tuple5<>(a, elem, c, d, e);
    }

    public <E> Tuple5<T0, T1, E, T3, T4> setC(E elem) {
        return new Tuple5<>(a, b, elem, d, e);
    }

    public <E> Tuple5<T0, T1, T2, E, T4> setD(E elem) {
        return new Tuple5<>(a, b, c, elem, e);
    }

    public <E> Tuple5<T0, T1, T2, T3, E> setE(E elem) {
        return new Tuple5<>(a, b, c, d, elem);
    }

    protected Tuple5(T0 a, T1 b, T2 c, T3 d, T4 e) {
        this(
                a, b, c, d, e,
                new Object[]{a, b, c, d, e},
                true
        );
    }

    protected Tuple5(
            T0 a, T1 b, T2 c, T3 d, T4 e,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null
        )) {
            throw new NullPointerException("Elements of a tuple can't be null");
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple5<?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple5<?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple5<T0, T1, T2, T3, T4> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple5<T0, T1, T2, T3, T4> clone() {
        return new Tuple5<>(
                a, b, c, d, e,
                valueList, false);
    }
}