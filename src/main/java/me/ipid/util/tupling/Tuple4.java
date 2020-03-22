/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple4<T0, T1, T2, T3>
    extends Tupling
    implements Comparable<Tuple4<T0, T1, T2, T3>> {

    private static final long serialVersionUID = 75998243309223937L;
    public final T0 a;
    public final T1 b;
    public final T2 c;
    public final T3 d;

    public static <E0, E1, E2, E3> Tuple4<E0, E1, E2, E3> of(
            E0 a, E1 b, E2 c, E3 d) {
        return new Tuple4<>(
                a, b, c, d);
    }

    public Tuple4<T0, T1, T2, T3> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E4> Tuple5<T0, T1, T2, T3, E4> add(Tuple1<E4> tX) {
        nullCheckOfAdd(tX);
        return new Tuple5<>(a, b, c, d, tX.a);
    }

    public <E4, E5> Tuple6<T0, T1, T2, T3, E4, E5> add(Tuple2<E4, E5> tX) {
        nullCheckOfAdd(tX);
        return new Tuple6<>(a, b, c, d, tX.a, tX.b);
    }

    public <E4, E5, E6> Tuple7<T0, T1, T2, T3, E4, E5, E6> add(Tuple3<E4, E5, E6> tX) {
        nullCheckOfAdd(tX);
        return new Tuple7<>(a, b, c, d, tX.a, tX.b, tX.c);
    }

    public <E4, E5, E6, E7> Tuple8<T0, T1, T2, T3, E4, E5, E6, E7> add(Tuple4<E4, E5, E6, E7> tX) {
        nullCheckOfAdd(tX);
        return new Tuple8<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d);
    }

    public <E> Tuple4<E, T1, T2, T3> setA(E elem) {
        return new Tuple4<>(elem, b, c, d);
    }

    public <E> Tuple4<T0, E, T2, T3> setB(E elem) {
        return new Tuple4<>(a, elem, c, d);
    }

    public <E> Tuple4<T0, T1, E, T3> setC(E elem) {
        return new Tuple4<>(a, b, elem, d);
    }

    public <E> Tuple4<T0, T1, T2, E> setD(E elem) {
        return new Tuple4<>(a, b, c, elem);
    }

    protected Tuple4(T0 a, T1 b, T2 c, T3 d) {
        this(
                a, b, c, d,
                new Object[]{a, b, c, d},
                true
        );
    }

    protected Tuple4(
            T0 a, T1 b, T2 c, T3 d,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null
        )) {
            throw new NullPointerException("Elements of a tuple can't be null");
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple4<?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple4<?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple4<T0, T1, T2, T3> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple4<T0, T1, T2, T3> clone() {
        return new Tuple4<>(
                a, b, c, d,
                valueList, false);
    }
}