/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>
    extends Tupling
    implements Comparable<Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20>> {

    private static final long serialVersionUID = 4383761656723800063L;
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
    public final T20 u;

    public static <E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> Tuple21<E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20> of(
            E0 a, E1 b, E2 c, E3 d, E4 e, E5 f, E6 g, E7 h, E8 i, E9 j, E10 k, E11 l, E12 m, E13 n, E14 o, E15 p, E16 q, E17 r, E18 s, E19 t, E20 u) {
        return new Tuple21<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E21> Tuple22<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, E21> add(Tuple1<E21> tX) {
        nullCheckOfAdd(tX);
        return new Tuple22<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, tX.a);
    }

    public <E21, E22> Tuple23<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, E21, E22> add(Tuple2<E21, E22> tX) {
        nullCheckOfAdd(tX);
        return new Tuple23<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, tX.a, tX.b);
    }

    public <E21, E22, E23> Tuple24<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, E21, E22, E23> add(Tuple3<E21, E22, E23> tX) {
        nullCheckOfAdd(tX);
        return new Tuple24<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, tX.a, tX.b, tX.c);
    }

    public <E21, E22, E23, E24> Tuple25<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, E21, E22, E23, E24> add(Tuple4<E21, E22, E23, E24> tX) {
        nullCheckOfAdd(tX);
        return new Tuple25<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, tX.a, tX.b, tX.c, tX.d);
    }

    public <E21, E22, E23, E24, E25> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, E21, E22, E23, E24, E25> add(Tuple5<E21, E22, E23, E24, E25> tX) {
        nullCheckOfAdd(tX);
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, tX.a, tX.b, tX.c, tX.d, tX.e);
    }

    public <E> Tuple21<E, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setA(E elem) {
        return new Tuple21<>(elem, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, E, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setB(E elem) {
        return new Tuple21<>(a, elem, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, E, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setC(E elem) {
        return new Tuple21<>(a, b, elem, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, E, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setD(E elem) {
        return new Tuple21<>(a, b, c, elem, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, E, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setE(E elem) {
        return new Tuple21<>(a, b, c, d, elem, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, E, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setF(E elem) {
        return new Tuple21<>(a, b, c, d, e, elem, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, E, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setG(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, elem, h, i, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, E, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setH(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, elem, i, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, E, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setI(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, elem, j, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, E, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setJ(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, elem, k, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, E, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> setK(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, elem, l, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E, T12, T13, T14, T15, T16, T17, T18, T19, T20> setL(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, elem, m, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, E, T13, T14, T15, T16, T17, T18, T19, T20> setM(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, elem, n, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E, T14, T15, T16, T17, T18, T19, T20> setN(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, elem, o, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E, T15, T16, T17, T18, T19, T20> setO(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, elem, p, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, E, T16, T17, T18, T19, T20> setP(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, elem, q, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, E, T17, T18, T19, T20> setQ(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, elem, r, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, E, T18, T19, T20> setR(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, elem, s, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, E, T19, T20> setS(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, elem, t, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, E, T20> setT(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, elem, u);
    }

    public <E> Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E> setU(E elem) {
        return new Tuple21<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, elem);
    }

    protected Tuple21(T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m, T13 n, T14 o, T15 p, T16 q, T17 r, T18 s, T19 t, T20 u) {
        this(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u,
                new Object[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u},
                true
        );
    }

    protected Tuple21(
            T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m, T13 n, T14 o, T15 p, T16 q, T17 r, T18 s, T19 t, T20 u,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null || f == null || g == null || h == null || i == null || j == null || k == null || l == null || m == null || n == null || o == null || p == null || q == null || r == null || s == null || t == null || u == null
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
        this.u = u;
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

    public T20 getU() {
        return u;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple21<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple21<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple21<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20> clone() {
        return new Tuple21<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u,
                valueList, false);
    }
}