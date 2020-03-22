/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>
    extends Tupling
    implements Comparable<Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> {

    private static final long serialVersionUID = 4482981585846534143L;
    public final T0 a;
    public final T1 b;
    public final T2 c;
    public final T3 d;
    public final T4 e;
    public final T5 f;
    public final T6 g;
    public final T7 h;
    public final T8 i;
    public final T9 j;
    public final T10 k;

    public static <E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10> Tuple11<E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10> of(
            E0 a, E1 b, E2 c, E3 d, E4 e, E5 f, E6 g, E7 h, E8 i, E9 j, E10 k) {
        return new Tuple11<>(
                a, b, c, d, e, f, g, h, i, j, k);
    }

    public Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E11> Tuple12<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11> add(Tuple1<E11> tX) {
        nullCheckOfAdd(tX);
        return new Tuple12<>(a, b, c, d, e, f, g, h, i, j, k, tX.a);
    }

    public <E11, E12> Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12> add(Tuple2<E11, E12> tX) {
        nullCheckOfAdd(tX);
        return new Tuple13<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b);
    }

    public <E11, E12, E13> Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13> add(Tuple3<E11, E12, E13> tX) {
        nullCheckOfAdd(tX);
        return new Tuple14<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c);
    }

    public <E11, E12, E13, E14> Tuple15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14> add(Tuple4<E11, E12, E13, E14> tX) {
        nullCheckOfAdd(tX);
        return new Tuple15<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d);
    }

    public <E11, E12, E13, E14, E15> Tuple16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15> add(Tuple5<E11, E12, E13, E14, E15> tX) {
        nullCheckOfAdd(tX);
        return new Tuple16<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E11, E12, E13, E14, E15, E16> Tuple17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16> add(Tuple6<E11, E12, E13, E14, E15, E16> tX) {
        nullCheckOfAdd(tX);
        return new Tuple17<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f);
    }

    public <E11, E12, E13, E14, E15, E16, E17> Tuple18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16, E17> add(Tuple7<E11, E12, E13, E14, E15, E16, E17> tX) {
        nullCheckOfAdd(tX);
        return new Tuple18<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g);
    }

    public <E11, E12, E13, E14, E15, E16, E17, E18> Tuple19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16, E17, E18> add(Tuple8<E11, E12, E13, E14, E15, E16, E17, E18> tX) {
        nullCheckOfAdd(tX);
        return new Tuple19<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h);
    }

    public <E11, E12, E13, E14, E15, E16, E17, E18, E19> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16, E17, E18, E19> add(Tuple9<E11, E12, E13, E14, E15, E16, E17, E18, E19> tX) {
        nullCheckOfAdd(tX);
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i);
    }

    public <E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> add(Tuple10<E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> tX) {
        nullCheckOfAdd(tX);
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j);
    }

    public <E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> add(Tuple11<E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k);
    }

    public <E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> Tuple23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> add(Tuple12<E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l);
    }

    public <E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> Tuple24<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> add(Tuple13<E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m);
    }

    public <E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> Tuple25<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> add(Tuple14<E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n);
    }

    public <E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> add(Tuple15<E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m, tX.n, tX.o);
    }

    public <E> Tuple11<E, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> setA(E elem) {
        return new Tuple11<>(elem, b, c, d, e, f, g, h, i, j, k);
    }

    public <E> Tuple11<T0, E, T2, T3, T4, T5, T6, T7, T8, T9, T10> setB(E elem) {
        return new Tuple11<>(a, elem, c, d, e, f, g, h, i, j, k);
    }

    public <E> Tuple11<T0, T1, E, T3, T4, T5, T6, T7, T8, T9, T10> setC(E elem) {
        return new Tuple11<>(a, b, elem, d, e, f, g, h, i, j, k);
    }

    public <E> Tuple11<T0, T1, T2, E, T4, T5, T6, T7, T8, T9, T10> setD(E elem) {
        return new Tuple11<>(a, b, c, elem, e, f, g, h, i, j, k);
    }

    public <E> Tuple11<T0, T1, T2, T3, E, T5, T6, T7, T8, T9, T10> setE(E elem) {
        return new Tuple11<>(a, b, c, d, elem, f, g, h, i, j, k);
    }

    public <E> Tuple11<T0, T1, T2, T3, T4, E, T6, T7, T8, T9, T10> setF(E elem) {
        return new Tuple11<>(a, b, c, d, e, elem, g, h, i, j, k);
    }

    public <E> Tuple11<T0, T1, T2, T3, T4, T5, E, T7, T8, T9, T10> setG(E elem) {
        return new Tuple11<>(a, b, c, d, e, f, elem, h, i, j, k);
    }

    public <E> Tuple11<T0, T1, T2, T3, T4, T5, T6, E, T8, T9, T10> setH(E elem) {
        return new Tuple11<>(a, b, c, d, e, f, g, elem, i, j, k);
    }

    public <E> Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, E, T9, T10> setI(E elem) {
        return new Tuple11<>(a, b, c, d, e, f, g, h, elem, j, k);
    }

    public <E> Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, E, T10> setJ(E elem) {
        return new Tuple11<>(a, b, c, d, e, f, g, h, i, elem, k);
    }

    public <E> Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, E> setK(E elem) {
        return new Tuple11<>(a, b, c, d, e, f, g, h, i, j, elem);
    }

    protected Tuple11(T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k) {
        this(
                a, b, c, d, e, f, g, h, i, j, k,
                new Object[]{a, b, c, d, e, f, g, h, i, j, k},
                true
        );
    }

    protected Tuple11(
            T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null || f == null || g == null || h == null || i == null || j == null || k == null
        )) {
            throw new NullPointerException("Elements of a tuple can't be null");
        }

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
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

    public T4 getE() {
        return e;
    }

    public T5 getF() {
        return f;
    }

    public T6 getG() {
        return g;
    }

    public T7 getH() {
        return h;
    }

    public T8 getI() {
        return i;
    }

    public T9 getJ() {
        return j;
    }

    public T10 getK() {
        return k;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple11<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple11<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> clone() {
        return new Tuple11<>(
                a, b, c, d, e, f, g, h, i, j, k,
                valueList, false);
    }
}