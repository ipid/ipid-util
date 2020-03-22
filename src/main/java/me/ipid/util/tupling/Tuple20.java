/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>
    extends Tupling
    implements Comparable<Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> {

    private static final long serialVersionUID = 216735731396116481L;
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
    public final T14 o;
    public final T15 p;
    public final T16 q;
    public final T17 r;
    public final T18 s;
    public final T19 t;

    public static <E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> Tuple20<E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19> of(
            E0 a, E1 b, E2 c, E3 d, E4 e, E5 f, E6 g, E7 h, E8 i, E9 j, E10 k, E11 l, E12 m, E13 n, E14 o, E15 p, E16 q, E17 r, E18 s, E19 t) {
        return new Tuple20<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
    }

    public Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E20> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E20> add(Tuple1<E20> tX) {
        nullCheckOfAdd(tX);
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, tX.a);
    }

    public <E20, E21> Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E20, E21> add(Tuple2<E20, E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, tX.a, tX.b);
    }

    public <E20, E21, E22> Tuple23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E20, E21, E22> add(Tuple3<E20, E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, tX.a, tX.b, tX.c);
    }

    public <E20, E21, E22, E23> Tuple24<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E20, E21, E22, E23> add(Tuple4<E20, E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, tX.a, tX.b, tX.c, tX.d);
    }

    public <E20, E21, E22, E23, E24> Tuple25<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E20, E21, E22, E23, E24> add(Tuple5<E20, E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E20, E21, E22, E23, E24, E25> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E20, E21, E22, E23, E24, E25> add(Tuple6<E20, E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, tX.a, tX.b, tX.c, tX.d, tX.e, tX.f);
    }

    public <E> Tuple20<E, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setA(E elem) {
        return new Tuple20<>(elem, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, E, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setB(E elem) {
        return new Tuple20<>(a, elem, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, E, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setC(E elem) {
        return new Tuple20<>(a, b, elem, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, E, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setD(E elem) {
        return new Tuple20<>(a, b, c, elem, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, E, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setE(E elem) {
        return new Tuple20<>(a, b, c, d, elem, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, E, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setF(E elem) {
        return new Tuple20<>(a, b, c, d, e, elem, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, E, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setG(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, elem, h, i, j, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, E, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setH(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, elem, i, j, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, E, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setI(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, elem, j, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, E, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> setJ(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, elem, k, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, E, T11, T12, T13, T14, T15, T16, T17, T18, T19> setK(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, elem, l, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E, T12, T13, T14, T15, T16, T17, T18, T19> setL(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, elem, m, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, E, T13, T14, T15, T16, T17, T18, T19> setM(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, elem, n, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E, T14, T15, T16, T17, T18, T19> setN(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, m, elem, o, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E, T15, T16, T17, T18, T19> setO(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, elem, p, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, E, T16, T17, T18, T19> setP(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, elem, q, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, E, T17, T18, T19> setQ(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, elem, r, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, E, T18, T19> setR(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, elem, s, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, E, T19> setS(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, elem, t);
    }

    public <E> Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, E> setT(E elem) {
        return new Tuple20<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, elem);
    }

    protected Tuple20(T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m, T13 n, T14 o, T15 p, T16 q, T17 r, T18 s, T19 t) {
        this(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t,
                new Object[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t},
                true
        );
    }

    protected Tuple20(
            T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m, T13 n, T14 o, T15 p, T16 q, T17 r, T18 s, T19 t,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null || f == null || g == null || h == null || i == null || j == null || k == null || l == null || m == null || n == null || o == null || p == null || q == null || r == null || s == null || t == null
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
        this.o = o;
        this.p = p;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
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

    public T14 getO() {
        return o;
    }

    public T15 getP() {
        return p;
    }

    public T16 getQ() {
        return q;
    }

    public T17 getR() {
        return r;
    }

    public T18 getS() {
        return s;
    }

    public T19 getT() {
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple20<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple20<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple20<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> clone() {
        return new Tuple20<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t,
                valueList, false);
    }
}