/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;
import java.util.Map;

public final class Tuple2<T0, T1>
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

    public Tuple2<T0, T1> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E2> Tuple3<T0, T1, E2> add(Tuple1<E2> tX) {
        nullCheckOfAdd(tX);
        return new Tuple3<>(a, b, tX.a);
    }

    public <E2, E3> Tuple4<T0, T1, E2, E3> add(Tuple2<E2, E3> tX) {
        nullCheckOfAdd(tX);
        return new Tuple4<>(a, b, tX.a, tX.b);
    }

    public <E2, E3, E4> Tuple5<T0, T1, E2, E3, E4> add(Tuple3<E2, E3, E4> tX) {
        nullCheckOfAdd(tX);
        return new Tuple5<>(a, b, tX.a, tX.b, tX.c);
    }

    public <E2, E3, E4, E5> Tuple6<T0, T1, E2, E3, E4, E5> add(Tuple4<E2, E3, E4, E5> tX) {
        nullCheckOfAdd(tX);
        return new Tuple6<>(a, b, tX.a, tX.b, tX.c, tX.d);
    }

    public <E2, E3, E4, E5, E6> Tuple7<T0, T1, E2, E3, E4, E5, E6> add(Tuple5<E2, E3, E4, E5, E6> tX) {
        nullCheckOfAdd(tX);
        return new Tuple7<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E2, E3, E4, E5, E6, E7> Tuple8<T0, T1, E2, E3, E4, E5, E6, E7> add(Tuple6<E2, E3, E4, E5, E6, E7> tX) {
        nullCheckOfAdd(tX);
        return new Tuple8<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f);
    }

    public <E> Tuple2<E, T1> setA(E elem) {
        return new Tuple2<>(elem, b);
    }

    public <E> Tuple2<T0, E> setB(E elem) {
        return new Tuple2<>(a, elem);
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
            throw new NullPointerException("Elements of a tuple can't be null");
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