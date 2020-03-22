/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>
    extends Tupling
    implements Comparable<Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> {

    private static final long serialVersionUID = 155514924062212097L;
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
    public final T13 n;

    public static <E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> Tuple14<E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13> of(
            E0 a, E1 b, E2 c, E3 d, E4 e, E5 f, E6 g, E7 h, E8 i, E9 j, E10 k, E11 l, E12 m, E13 n) {
        return new Tuple14<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n);
    }

    public Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E14> Tuple15<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14> add(Tuple1<E14> tX) {
        nullCheckOfAdd(tX);
        return new Tuple15<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a);
    }

    public <E14, E15> Tuple16<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15> add(Tuple2<E14, E15> tX) {
        nullCheckOfAdd(tX);
        return new Tuple16<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b);
    }

    public <E14, E15, E16> Tuple17<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16> add(Tuple3<E14, E15, E16> tX) {
        nullCheckOfAdd(tX);
        return new Tuple17<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c);
    }

    public <E14, E15, E16, E17> Tuple18<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16, E17> add(Tuple4<E14, E15, E16, E17> tX) {
        nullCheckOfAdd(tX);
        return new Tuple18<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c, tX.d);
    }

    public <E14, E15, E16, E17, E18> Tuple19<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16, E17, E18> add(Tuple5<E14, E15, E16, E17, E18> tX) {
        nullCheckOfAdd(tX);
        return new Tuple19<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E14, E15, E16, E17, E18, E19> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16, E17, E18, E19> add(Tuple6<E14, E15, E16, E17, E18, E19> tX) {
        nullCheckOfAdd(tX);
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f);
    }

    public <E14, E15, E16, E17, E18, E19, E20> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16, E17, E18, E19, E20> add(Tuple7<E14, E15, E16, E17, E18, E19, E20> tX) {
        nullCheckOfAdd(tX);
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g);
    }

    public <E14, E15, E16, E17, E18, E19, E20, E21> Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16, E17, E18, E19, E20, E21> add(Tuple8<E14, E15, E16, E17, E18, E19, E20, E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h);
    }

    public <E14, E15, E16, E17, E18, E19, E20, E21, E22> Tuple23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16, E17, E18, E19, E20, E21, E22> add(Tuple9<E14, E15, E16, E17, E18, E19, E20, E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i);
    }

    public <E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> Tuple24<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> add(Tuple10<E14, E15, E16, E17, E18, E19, E20, E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j);
    }

    public <E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> Tuple25<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> add(Tuple11<E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k);
    }

    public <E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> add(Tuple12<E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f, tX.g, tX.h, tX.i, tX.j, tX.k, tX.l);
    }

    public <E> Tuple14<E, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> setA(E elem) {
        return new Tuple14<>(elem, b, c, d, e, f, g, h, i, j, k, l, m, n);
    }

    public <E> Tuple14<T0, E, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> setB(E elem) {
        return new Tuple14<>(a, elem, c, d, e, f, g, h, i, j, k, l, m, n);
    }

    public <E> Tuple14<T0, T1, E, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> setC(E elem) {
        return new Tuple14<>(a, b, elem, d, e, f, g, h, i, j, k, l, m, n);
    }

    public <E> Tuple14<T0, T1, T2, E, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> setD(E elem) {
        return new Tuple14<>(a, b, c, elem, e, f, g, h, i, j, k, l, m, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, E, T5, T6, T7, T8, T9, T10, T11, T12, T13> setE(E elem) {
        return new Tuple14<>(a, b, c, d, elem, f, g, h, i, j, k, l, m, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, T4, E, T6, T7, T8, T9, T10, T11, T12, T13> setF(E elem) {
        return new Tuple14<>(a, b, c, d, e, elem, g, h, i, j, k, l, m, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, T4, T5, E, T7, T8, T9, T10, T11, T12, T13> setG(E elem) {
        return new Tuple14<>(a, b, c, d, e, f, elem, h, i, j, k, l, m, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, T4, T5, T6, E, T8, T9, T10, T11, T12, T13> setH(E elem) {
        return new Tuple14<>(a, b, c, d, e, f, g, elem, i, j, k, l, m, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, E, T9, T10, T11, T12, T13> setI(E elem) {
        return new Tuple14<>(a, b, c, d, e, f, g, h, elem, j, k, l, m, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, E, T10, T11, T12, T13> setJ(E elem) {
        return new Tuple14<>(a, b, c, d, e, f, g, h, i, elem, k, l, m, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, E, T11, T12, T13> setK(E elem) {
        return new Tuple14<>(a, b, c, d, e, f, g, h, i, j, elem, l, m, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E, T12, T13> setL(E elem) {
        return new Tuple14<>(a, b, c, d, e, f, g, h, i, j, k, elem, m, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, E, T13> setM(E elem) {
        return new Tuple14<>(a, b, c, d, e, f, g, h, i, j, k, l, elem, n);
    }

    public <E> Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E> setN(E elem) {
        return new Tuple14<>(a, b, c, d, e, f, g, h, i, j, k, l, m, elem);
    }

    protected Tuple14(T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m, T13 n) {
        this(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n,
                new Object[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n},
                true
        );
    }

    protected Tuple14(
            T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m, T13 n,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null || f == null || g == null || h == null || i == null || j == null || k == null || l == null || m == null || n == null
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
        this.n = n;
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

    public T13 getN() {
        return n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple14<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple14<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> clone() {
        return new Tuple14<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n,
                valueList, false);
    }
}