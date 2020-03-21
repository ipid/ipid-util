/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;
import java.util.Map;

public class Tuple2<T0, T1>
    extends Tupling
    implements Comparable<Tuple2<T0, T1>>, Map.Entry<T0, T1> {

    private static final long serialVersionUID = 63472606879154177L;
    public final T0 a;
    public final T1 b;

    public static <E0, E1> Tuple2<E0, E1> of(
            E0 a, E1 b) {
        return new Tuple2<>(
                a, b);
    }

    public Tuple2<T0, T1> add(Tuple0 t) {
        nullCheckOfAdd(t);
        return this;
    }

    public <E2> Tuple3<T0, T1, E2> add(Tuple1<E2> t) {
        nullCheckOfAdd(t);
        return new Tuple3<>(a, b, t.a);
    }

    public <E2, E3> Tuple4<T0, T1, E2, E3> add(Tuple2<E2, E3> t) {
        nullCheckOfAdd(t);
        return new Tuple4<>(a, b, t.a, t.b);
    }

    protected Tuple2(T0 a, T1 b) {
        this(
                a, b,
                new Object[]{a, b},
                true
        );
    }

    protected Tuple2(
            T0 a, T1 b,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null
        )) {
            throw new IllegalArgumentException("Elements of a tuple can't be null");
        }

        this.a = a;
        this.b = b;
        this.valueList = valueList;
    }

    public T0 getA() {
        return a;
    }

    public T1 getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple2<?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple2<?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple2<T0, T1> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple2<T0, T1> clone() {
        return new Tuple2<>(
                a, b,
                valueList, false);
    }

    @Override
    public T0 getKey() {
        return a;
    }

    @Override
    public T1 getValue() {
        return b;
    }

    /**
     * Tuple2 is immutable. Call setValue will throw an exception.
     *
     * @param value Doesn't matter
     * @return N/A
     */
    @Override
    public T1 setValue(T1 value) {
        throw new UnsupportedOperationException("tupling.Tuple2 is immutable");
    }
}