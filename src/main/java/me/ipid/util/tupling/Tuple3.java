/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple3<T0, T1, T2>
    extends Tupling
    implements Comparable<Tuple3<T0, T1, T2>> {

    private static final long serialVersionUID = 4542091330821554175L;
    public final T0 a;
    public final T1 b;
    public final T2 c;

    public static <E0, E1, E2> Tuple3<E0, E1, E2> of(
            E0 a, E1 b, E2 c) {
        return new Tuple3<>(
                a, b, c);
    }

    public Tuple3<T0, T1, T2> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E3> Tuple4<T0, T1, T2, E3> add(Tuple1<E3> tX) {
        nullCheckOfAdd(tX);
        return new Tuple4<>(a, b, c, tX.a);
    }

    public <E3, E4> Tuple5<T0, T1, T2, E3, E4> add(Tuple2<E3, E4> tX) {
        nullCheckOfAdd(tX);
        return new Tuple5<>(a, b, c, tX.a, tX.b);
    }

    public <E3, E4, E5> Tuple6<T0, T1, T2, E3, E4, E5> add(Tuple3<E3, E4, E5> tX) {
        nullCheckOfAdd(tX);
        return new Tuple6<>(a, b, c, tX.a, tX.b, tX.c);
    }

    public <E3, E4, E5, E6> Tuple7<T0, T1, T2, E3, E4, E5, E6> add(Tuple4<E3, E4, E5, E6> tX) {
        nullCheckOfAdd(tX);
        return new Tuple7<>(a, b, c, tX.a, tX.b, tX.c, tX.d);
    }

    public <E3, E4, E5, E6, E7> Tuple8<T0, T1, T2, E3, E4, E5, E6, E7> add(Tuple5<E3, E4, E5, E6, E7> tX) {
        nullCheckOfAdd(tX);
        return new Tuple8<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E> Tuple3<E, T1, T2> setA(E elem) {
        return new Tuple3<>(elem, b, c);
    }

    public <E> Tuple3<T0, E, T2> setB(E elem) {
        return new Tuple3<>(a, elem, c);
    }

    public <E> Tuple3<T0, T1, E> setC(E elem) {
        return new Tuple3<>(a, b, elem);
    }

    protected Tuple3(T0 a, T1 b, T2 c) {
        this(
                a, b, c,
                new Object[]{a, b, c},
                true
        );
    }

    protected Tuple3(
            T0 a, T1 b, T2 c,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null
        )) {
            throw new NullPointerException("Elements of a tuple can't be null");
        }

        this.a = a;
        this.b = b;
        this.c = c;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple3<?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple3<?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple3<T0, T1, T2> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple3<T0, T1, T2> clone() {
        return new Tuple3<>(
                a, b, c,
                valueList, false);
    }
}