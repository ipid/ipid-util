/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>
    extends Tupling
    implements Comparable<Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> {

    private static final long serialVersionUID = 4465389399835672575L;
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
    public final T11 l;
    public final T12 m;

    public static <E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> Tuple13<E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12> of(
            E0 a, E1 b, E2 c, E3 d, E4 e, E5 f, E6 g, E7 h, E8 i, E9 j, E10 k, E11 l, E12 m) {
        return new Tuple13<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m);
    }

    public Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E13> Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13> add(Tuple1<E13> tX) {
        nullCheckOfAdd(tX);
        return new Tuple14<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a);
    }

    public <E13, E14> Tuple15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14> add(Tuple2<E13, E14> tX) {
        nullCheckOfAdd(tX);
        return new Tuple15<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b);
    }

    public <E13, E14, E15> Tuple16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15> add(Tuple3<E13, E14, E15> tX) {
        nullCheckOfAdd(tX);
        return new Tuple16<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c);
    }

    public <E13, E14, E15, E16> Tuple17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16> add(Tuple4<E13, E14, E15, E16> tX) {
        nullCheckOfAdd(tX);
        return new Tuple17<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d);
    }

    public <E13, E14, E15, E16, E17> Tuple18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16, E17> add(Tuple5<E13, E14, E15, E16, E17> tX) {
        nullCheckOfAdd(tX);
        return new Tuple18<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E13, E14, E15, E16, E17, E18> Tuple19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16, E17, E18> add(Tuple6<E13, E14, E15, E16, E17, E18> tX) {
        nullCheckOfAdd(tX);
        return new Tuple19<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f);
    }

    public <E13, E14, E15, E16, E17, E18, E19> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16, E17, E18, E19> add(Tuple7<E13, E14, E15, E16, E17, E18, E19> tX) {
        nullCheckOfAdd(tX);
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g);
    }

    public <E13, E14, E15, E16, E17, E18, E19, E20> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16, E17, E18, E19, E20> add(Tuple8<E13, E14, E15, E16, E17, E18, E19, E20> tX) {
        nullCheckOfAdd(tX);
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h);
    }

    public <E13, E14, E15, E16, E17, E18, E19, E20, E21> Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16, E17, E18, E19, E20, E21> add(Tuple9<E13, E14, E15, E16, E17, E18, E19, E20, E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i);
    }

    public <E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> Tuple23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> add(Tuple10<E13, E14, E15, E16, E17, E18, E19, E20, E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j);
    }

    public <E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> Tuple24<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> add(Tuple11<E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k);
    }

    public <E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> Tuple25<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> add(Tuple12<E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l);
    }

    public <E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> add(Tuple13<E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l, tX.m);
    }

    public <E> Tuple13<E, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> setA(E elem) {
        return new Tuple13<>(elem, b, c, d, e, f, g, h, i, j, k, l, m);
    }

    public <E> Tuple13<T0, E, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> setB(E elem) {
        return new Tuple13<>(a, elem, c, d, e, f, g, h, i, j, k, l, m);
    }

    public <E> Tuple13<T0, T1, E, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> setC(E elem) {
        return new Tuple13<>(a, b, elem, d, e, f, g, h, i, j, k, l, m);
    }

    public <E> Tuple13<T0, T1, T2, E, T4, T5, T6, T7, T8, T9, T10, T11, T12> setD(E elem) {
        return new Tuple13<>(a, b, c, elem, e, f, g, h, i, j, k, l, m);
    }

    public <E> Tuple13<T0, T1, T2, T3, E, T5, T6, T7, T8, T9, T10, T11, T12> setE(E elem) {
        return new Tuple13<>(a, b, c, d, elem, f, g, h, i, j, k, l, m);
    }

    public <E> Tuple13<T0, T1, T2, T3, T4, E, T6, T7, T8, T9, T10, T11, T12> setF(E elem) {
        return new Tuple13<>(a, b, c, d, e, elem, g, h, i, j, k, l, m);
    }

    public <E> Tuple13<T0, T1, T2, T3, T4, T5, E, T7, T8, T9, T10, T11, T12> setG(E elem) {
        return new Tuple13<>(a, b, c, d, e, f, elem, h, i, j, k, l, m);
    }

    public <E> Tuple13<T0, T1, T2, T3, T4, T5, T6, E, T8, T9, T10, T11, T12> setH(E elem) {
        return new Tuple13<>(a, b, c, d, e, f, g, elem, i, j, k, l, m);
    }

    public <E> Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, E, T9, T10, T11, T12> setI(E elem) {
        return new Tuple13<>(a, b, c, d, e, f, g, h, elem, j, k, l, m);
    }

    public <E> Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, E, T10, T11, T12> setJ(E elem) {
        return new Tuple13<>(a, b, c, d, e, f, g, h, i, elem, k, l, m);
    }

    public <E> Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, E, T11, T12> setK(E elem) {
        return new Tuple13<>(a, b, c, d, e, f, g, h, i, j, elem, l, m);
    }

    public <E> Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E, T12> setL(E elem) {
        return new Tuple13<>(a, b, c, d, e, f, g, h, i, j, k, elem, m);
    }

    public <E> Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, E> setM(E elem) {
        return new Tuple13<>(a, b, c, d, e, f, g, h, i, j, k, l, elem);
    }

    protected Tuple13(T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m) {
        this(
                a, b, c, d, e, f, g, h, i, j, k, l, m,
                new Object[]{a, b, c, d, e, f, g, h, i, j, k, l, m},
                true
        );
    }

    protected Tuple13(
            T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null || f == null || g == null || h == null || i == null || j == null || k == null || l == null || m == null
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
        this.l = l;
        this.m = m;
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

    public T11 getL() {
        return l;
    }

    public T12 getM() {
        return m;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple13<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple13<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> clone() {
        return new Tuple13<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m,
                valueList, false);
    }
}