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

    public <E1, E2, E3, E4, E5, E6, E7, E8> Tuple9<T0, E1, E2, E3, E4, E5, E6, E7, E8> add(Tuple8<E1, E2, E3, E4, E5, E6, E7, E8> tX) {
        nullCheckOfAdd(tX);
        return new Tuple9<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9> Tuple10<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9> add(Tuple9<E1, E2, E3, E4, E5, E6, E7, E8, E9> tX) {
        nullCheckOfAdd(tX);
        return new Tuple10<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10> Tuple11<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10> add(Tuple10<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10> tX) {
        nullCheckOfAdd(tX);
        return new Tuple11<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11> Tuple12<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11> add(Tuple11<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11> tX) {
        nullCheckOfAdd(tX);
        return new Tuple12<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> Tuple13<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> add(Tuple12<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> tX) {
        nullCheckOfAdd(tX);
        return new Tuple13<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> Tuple14<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> add(Tuple13<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> tX) {
        nullCheckOfAdd(tX);
        return new Tuple14<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> Tuple15<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> add(Tuple14<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> tX) {
        nullCheckOfAdd(tX);
        return new Tuple15<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> Tuple16<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> add(Tuple15<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> tX) {
        nullCheckOfAdd(tX);
        return new Tuple16<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> Tuple17<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> add(Tuple16<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> tX) {
        nullCheckOfAdd(tX);
        return new Tuple17<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> Tuple18<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> add(Tuple17<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> tX) {
        nullCheckOfAdd(tX);
        return new Tuple18<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> Tuple19<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> add(Tuple18<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> tX) {
        nullCheckOfAdd(tX);
        return new Tuple19<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> Tuple20<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> add(Tuple19<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> tX) {
        nullCheckOfAdd(tX);
        return new Tuple20<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> Tuple21<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> add(Tuple20<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> tX) {
        nullCheckOfAdd(tX);
        return new Tuple21<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> Tuple22<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> add(Tuple21<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> Tuple23<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> add(Tuple22<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> Tuple24<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> add(Tuple23<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v, tX.w);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> Tuple25<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> add(Tuple24<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v, tX.w, tX.x);
    }

    public <E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> Tuple26<T0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> add(Tuple25<E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v, tX.w, tX.x, tX.y);
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