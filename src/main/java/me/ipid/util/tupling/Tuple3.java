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

    public Tuple3<T0, T1, T2> add(Tuple0 t) {
        nullCheckOfAdd(t);
        return this;
    }

    public <E3> Tuple4<T0, T1, T2, E3> add(Tuple1<E3> t) {
        nullCheckOfAdd(t);
        return new Tuple4<>(a, b, c, t.a);
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
            throw new IllegalArgumentException("Elements of a tuple can't be null");
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