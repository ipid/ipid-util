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

    public Tuple1<T0> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E1> Tuple2<T0, E1> add(Tuple1<E1> tX) {
        nullCheckOfAdd(tX);
        return new Tuple2<>(a, tX.a);
    }

    public <E1, E2> Tuple3<T0, E1, E2> add(Tuple2<E1, E2> tX) {
        nullCheckOfAdd(tX);
        return new Tuple3<>(a, tX.a, tX.b);
    }

    public <E1, E2, E3> Tuple4<T0, E1, E2, E3> add(Tuple3<E1, E2, E3> tX) {
        nullCheckOfAdd(tX);
        return new Tuple4<>(a, tX.a, tX.b, tX.c);
    }

    public <E1, E2, E3, E4> Tuple5<T0, E1, E2, E3, E4> add(Tuple4<E1, E2, E3, E4> tX) {
        nullCheckOfAdd(tX);
        return new Tuple5<>(a, tX.a, tX.b, tX.c, tX.d);
    }

    public <E1, E2, E3, E4, E5> Tuple6<T0, E1, E2, E3, E4, E5> add(Tuple5<E1, E2, E3, E4, E5> tX) {
        nullCheckOfAdd(tX);
        return new Tuple6<>(a, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E1, E2, E3, E4, E5, E6> Tuple7<T0, E1, E2, E3, E4, E5, E6> add(Tuple6<E1, E2, E3, E4, E5, E6> tX) {
        nullCheckOfAdd(tX);
        return new Tuple7<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f);
    }

    public <E1, E2, E3, E4, E5, E6, E7> Tuple8<T0, E1, E2, E3, E4, E5, E6, E7> add(Tuple7<E1, E2, E3, E4, E5, E6, E7> tX) {
        nullCheckOfAdd(tX);
        return new Tuple8<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g);
    }

    public <E> Tuple1<E> setA(E elem) {
        return new Tuple1<>(elem);
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