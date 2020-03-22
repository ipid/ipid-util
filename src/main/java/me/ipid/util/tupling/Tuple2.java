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

    public <E2, E3, E4, E5, E6, E7, E8> Tuple9<T0, T1, E2, E3, E4, E5, E6, E7, E8> add(Tuple7<E2, E3, E4, E5, E6, E7, E8> tX) {
        nullCheckOfAdd(tX);
        return new Tuple9<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9> Tuple10<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9> add(Tuple8<E2, E3, E4, E5, E6, E7, E8, E9> tX) {
        nullCheckOfAdd(tX);
        return new Tuple10<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10> Tuple11<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10> add(Tuple9<E2, E3, E4, E5, E6, E7, E8, E9, E10> tX) {
        nullCheckOfAdd(tX);
        return new Tuple11<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11> Tuple12<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11> add(Tuple10<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11> tX) {
        nullCheckOfAdd(tX);
        return new Tuple12<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> Tuple13<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> add(Tuple11<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> tX) {
        nullCheckOfAdd(tX);
        return new Tuple13<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> Tuple14<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> add(Tuple12<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> tX) {
        nullCheckOfAdd(tX);
        return new Tuple14<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> Tuple15<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> add(Tuple13<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> tX) {
        nullCheckOfAdd(tX);
        return new Tuple15<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> Tuple16<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> add(Tuple14<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> tX) {
        nullCheckOfAdd(tX);
        return new Tuple16<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> Tuple17<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> add(Tuple15<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> tX) {
        nullCheckOfAdd(tX);
        return new Tuple17<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> Tuple18<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> add(Tuple16<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> tX) {
        nullCheckOfAdd(tX);
        return new Tuple18<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> Tuple19<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> add(Tuple17<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> tX) {
        nullCheckOfAdd(tX);
        return new Tuple19<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> Tuple20<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> add(Tuple18<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> tX) {
        nullCheckOfAdd(tX);
        return new Tuple20<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> Tuple21<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> add(Tuple19<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> tX) {
        nullCheckOfAdd(tX);
        return new Tuple21<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> Tuple22<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> add(Tuple20<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> Tuple23<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> add(Tuple21<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> Tuple24<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> add(Tuple22<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> Tuple25<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> add(Tuple23<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v, tX.w);
    }

    public <E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> Tuple26<T0, T1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> add(Tuple24<E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, b, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v, tX.w, tX.x);
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