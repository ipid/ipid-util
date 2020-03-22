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

    public <E4, E5, E6, E7, E8> Tuple9<T0, T1, T2, T3, E4, E5, E6, E7, E8> add(Tuple5<E4, E5, E6, E7, E8> tX) {
        nullCheckOfAdd(tX);
        return new Tuple9<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E4, E5, E6, E7, E8, E9> Tuple10<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9> add(Tuple6<E4, E5, E6, E7, E8, E9> tX) {
        nullCheckOfAdd(tX);
        return new Tuple10<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f);
    }

    public <E4, E5, E6, E7, E8, E9, E10> Tuple11<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10> add(Tuple7<E4, E5, E6, E7, E8, E9, E10> tX) {
        nullCheckOfAdd(tX);
        return new Tuple11<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11> Tuple12<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11> add(Tuple8<E4, E5, E6, E7, E8, E9, E10, E11> tX) {
        nullCheckOfAdd(tX);
        return new Tuple12<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12> Tuple13<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12> add(Tuple9<E4, E5, E6, E7, E8, E9, E10, E11, E12> tX) {
        nullCheckOfAdd(tX);
        return new Tuple13<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> Tuple14<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> add(Tuple10<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> tX) {
        nullCheckOfAdd(tX);
        return new Tuple14<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> Tuple15<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> add(Tuple11<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14> tX) {
        nullCheckOfAdd(tX);
        return new Tuple15<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> Tuple16<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> add(Tuple12<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15> tX) {
        nullCheckOfAdd(tX);
        return new Tuple16<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> Tuple17<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> add(Tuple13<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16> tX) {
        nullCheckOfAdd(tX);
        return new Tuple17<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> Tuple18<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> add(Tuple14<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17> tX) {
        nullCheckOfAdd(tX);
        return new Tuple18<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> Tuple19<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> add(Tuple15<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18> tX) {
        nullCheckOfAdd(tX);
        return new Tuple19<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> Tuple20<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> add(Tuple16<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> tX) {
        nullCheckOfAdd(tX);
        return new Tuple20<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> Tuple21<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> add(Tuple17<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> tX) {
        nullCheckOfAdd(tX);
        return new Tuple21<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> Tuple22<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> add(Tuple18<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> Tuple23<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> add(Tuple19<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> Tuple24<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> add(Tuple20<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> Tuple25<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> add(Tuple21<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u);
    }

    public <E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> Tuple26<T0, T1, T2, T3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> add(Tuple22<E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, b, c, d, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o, tX.p, tX.q, tX.r, tX.s, tX.t, tX.u, tX.v);
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