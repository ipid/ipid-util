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

    public Tuple4<T0, T1, T2, T3> add(Tuple0 t) {
        nullCheckOfAdd(t);
        return this;
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
            throw new IllegalArgumentException("Elements of a tuple can't be null");
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