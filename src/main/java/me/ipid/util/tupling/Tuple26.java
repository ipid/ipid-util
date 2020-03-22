/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

import java.util.Arrays;

public class Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25>
    extends Tupling
    implements Comparable<Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25>> {

    private static final long serialVersionUID = 288089637891604481L;
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
    public final T21 v;
    public final T22 w;
    public final T23 x;
    public final T24 y;
    public final T25 z;

    public static <E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> Tuple26<E0, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, E19, E20, E21, E22, E23, E24, E25> of(
            E0 a, E1 b, E2 c, E3 d, E4 e, E5 f, E6 g, E7 h, E8 i, E9 j, E10 k, E11 l, E12 m, E13 n, E14 o, E15 p, E16 q, E17 r, E18 s, E19 t, E20 u, E21 v, E22 w, E23 x, E24 y, E25 z) {
        return new Tuple26<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E> Tuple26<E, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setA(E elem) {
        return new Tuple26<>(elem, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, E, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setB(E elem) {
        return new Tuple26<>(a, elem, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, E, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setC(E elem) {
        return new Tuple26<>(a, b, elem, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, E, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setD(E elem) {
        return new Tuple26<>(a, b, c, elem, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, E, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setE(E elem) {
        return new Tuple26<>(a, b, c, d, elem, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, E, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setF(E elem) {
        return new Tuple26<>(a, b, c, d, e, elem, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, E, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setG(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, elem, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, E, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setH(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, elem, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, E, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setI(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, elem, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, E, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setJ(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, elem, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, E, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setK(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, elem, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, E, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setL(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, elem, m, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, E, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setM(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, elem, n, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, E, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setN(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, elem, o, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, E, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setO(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, elem, p, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, E, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> setP(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, elem, q, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, E, T17, T18, T19, T20, T21, T22, T23, T24, T25> setQ(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, elem, r, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, E, T18, T19, T20, T21, T22, T23, T24, T25> setR(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, elem, s, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, E, T19, T20, T21, T22, T23, T24, T25> setS(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, elem, t, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, E, T20, T21, T22, T23, T24, T25> setT(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, elem, u, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, E, T21, T22, T23, T24, T25> setU(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, elem, v, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, E, T22, T23, T24, T25> setV(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, elem, w, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, E, T23, T24, T25> setW(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, elem, x, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, E, T24, T25> setX(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, elem, y, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, E, T25> setY(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, elem, z);
    }

    public <E> Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, E> setZ(E elem) {
        return new Tuple26<>(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, elem);
    }

    protected Tuple26(T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m, T13 n, T14 o, T15 p, T16 q, T17 r, T18 s, T19 t, T20 u, T21 v, T22 w, T23 x, T24 y, T25 z) {
        this(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z,
                new Object[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z},
                true
        );
    }

    protected Tuple26(
            T0 a, T1 b, T2 c, T3 d, T4 e, T5 f, T6 g, T7 h, T8 i, T9 j, T10 k, T11 l, T12 m, T13 n, T14 o, T15 p, T16 q, T17 r, T18 s, T19 t, T20 u, T21 v, T22 w, T23 x, T24 y, T25 z,
            Object[] valueList, boolean nullCheck) {

        if (nullCheck && (
                a == null || b == null || c == null || d == null || e == null || f == null || g == null || h == null || i == null || j == null || k == null || l == null || m == null || n == null || o == null || p == null || q == null || r == null || s == null || t == null || u == null || v == null || w == null || x == null || y == null || z == null
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
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
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

    public T21 getV() {
        return v;
    }

    public T22 getW() {
        return w;
    }

    public T23 getX() {
        return x;
    }

    public T24 getY() {
        return y;
    }

    public T25 getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tuple26<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>)) {
            return false;
        }
        return Arrays.equals(valueList, ((Tuple26<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>) o).valueList);
    }

    @Override
    public int compareTo(Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> tuple) {
        return compare(this, tuple);
    }

    @Override
    public Tuple26<T0, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25> clone() {
        return new Tuple26<>(
                a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z,
                valueList, false);
    }
}