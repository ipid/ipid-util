/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple1<T0>
    extends Tupling
    implements Comparable<Tuple1<T0>> {

    private static final long serialVersionUID = 4554054017298202623L;
    public final T0 a;

    public static <E0> Tuple1<E0> of(
            E0 a) {
        return new Tuple1<>(
                a);
    }

    public Tuple1<T0> add(Tuple0 t) {
        nullCheckOfAdd(t);
        return this;
    }

    public <E1> Tuple2<T0, E1> add(Tuple1<E1> t) {
        nullCheckOfAdd(t);
        return new Tuple2<>(a, t.a);
    }

    public <E1, E2> Tuple3<T0, E1, E2> add(Tuple2<E1, E2> t) {
        nullCheckOfAdd(t);
        return new Tuple3<>(a, t.a, t.b);
    }

    public <E1, E2, E3> Tuple4<T0, E1, E2, E3> add(Tuple3<E1, E2, E3> t) {
        nullCheckOfAdd(t);
        return new Tuple4<>(a, t.a, t.b, t.c);
    }

    protected Tuple1(T0 a) {
        this(
                a,
                new Object[]{a},
                true
        );
    }

    protected Tuple1(
            T0 a,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null
        )) {
            throw new NullPointerException("Elements of a tuple can't be null");
        }

        this.a = a;
        this.valueList = valueList;
    }

    public T0 getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple1<?>)) {
            return false;
        }
        return a.equals(((Tuple1<?>) o).a);
    }

    @Override
    public int compareTo(Tuple1<T0> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple1<T0> clone() {
        return new Tuple1<>(
                a,
                valueList, false);
    }
}