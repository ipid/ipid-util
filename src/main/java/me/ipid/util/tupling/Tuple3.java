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

    public <E3, E4, E5, E6, E7, E8> Tuple9<T0, T1, T2, E3, E4, E5, E6, E7, E8> add(Tuple6<E3, E4, E5, E6, E7, E8> tX) {
        nullCheckOfAdd(tX);
        return new Tuple9<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f);
    }

    public <E3, E4, E5, E6, E7, E8, E9> Tuple10<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9> add(Tuple7<E3, E4, E5, E6, E7, E8, E9> tX) {
        nullCheckOfAdd(tX);
        return new Tuple10<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10> Tuple11<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10> add(Tuple8<E3, E4, E5, E6, E7, E8, E9, E10> tX) {
        nullCheckOfAdd(tX);
        return new Tuple11<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11> Tuple12<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11> add(Tuple9<E3, E4, E5, E6, E7, E8, E9, E10, E11> tX) {
        nullCheckOfAdd(tX);
        return new Tuple12<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> Tuple13<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> add(Tuple10<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> tX) {
        nullCheckOfAdd(tX);
        return new Tuple13<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> Tuple14<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> add(Tuple11<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> tX) {
        nullCheckOfAdd(tX);
        return new Tuple14<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> Tuple15<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> add(Tuple12<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> tX) {
        nullCheckOfAdd(tX);
        return new Tuple15<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> Tuple16<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> add(Tuple13<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> tX) {
        nullCheckOfAdd(tX);
        return new Tuple16<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> Tuple17<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> add(Tuple14<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> tX) {
        nullCheckOfAdd(tX);
        return new Tuple17<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> Tuple18<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> add(Tuple15<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> tX) {
        nullCheckOfAdd(tX);
        return new Tuple18<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> Tuple19<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> add(Tuple16<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> tX) {
        nullCheckOfAdd(tX);
        return new Tuple19<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> Tuple20<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> add(Tuple17<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> tX) {
        nullCheckOfAdd(tX);
        return new Tuple20<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> Tuple21<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> add(Tuple18<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> tX) {
        nullCheckOfAdd(tX);
        return new Tuple21<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> Tuple22<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> add(Tuple19<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> Tuple23<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> add(Tuple20<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> Tuple24<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> add(Tuple21<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> Tuple25<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> add(Tuple22<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v);
    }

    public <E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> Tuple26<T0, T1, T2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> add(Tuple23<E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, b, c, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v, tX.w);
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