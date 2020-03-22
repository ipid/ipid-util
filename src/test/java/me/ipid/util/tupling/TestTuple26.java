package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple26 {

    private static class C {
    }

    private static final int ELEMENT_NUM_MAX = 26;

    private static Tuple0 t0;
    private static Tuple1<Byte> t1;
    private static Tuple2<Byte, Short> t2;
    private static Tuple3<Byte, Short, Integer> t3;
    private static Tuple4<Byte, Short, Integer, Long> t4;
    private static Tuple5<Byte, Short, Integer, Long, Float> t5;
    private static Tuple6<Byte, Short, Integer, Long, Float, Double> t6;
    private static Tuple7<Byte, Short, Integer, Long, Float, Double, Character> t7;
    private static Tuple8<Byte, Short, Integer, Long, Float, Double, Character, Boolean> t8;
    private static Tuple9<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String> t9;
    private static Tuple10<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte> t10;
    private static Tuple11<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short> t11;
    private static Tuple12<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer> t12;
    private static Tuple13<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long> t13;
    private static Tuple14<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float> t14;
    private static Tuple15<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double> t15;
    private static Tuple16<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character> t16;
    private static Tuple17<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean> t17;
    private static Tuple18<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String> t18;
    private static Tuple19<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte> t19;
    private static Tuple20<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short> t20;
    private static Tuple21<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer> t21;
    private static Tuple22<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long> t22;
    private static Tuple23<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float> t23;
    private static Tuple24<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double> t24;
    private static Tuple25<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character> t25;
    private static Tuple26<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean> t26;

    @BeforeAll
    public static void initializeTuples() {
        t0 = Tuple0.of();
        t1 = Tuple1.of(((byte) 1));
        t2 = Tuple2.of(((byte) 1), ((short) 1));
        t3 = Tuple3.of(((byte) 1), ((short) 1), 1);
        t4 = Tuple4.of(((byte) 1), ((short) 1), 1, 1L);
        t5 = Tuple5.of(((byte) 1), ((short) 1), 1, 1L, 1.5f);
        t6 = Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5);
        t7 = Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c');
        t8 = Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        t9 = Tuple9.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc");
        t10 = Tuple10.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        t11 = Tuple11.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1));
        t12 = Tuple12.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1);
        t13 = Tuple13.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        t14 = Tuple14.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f);
        t15 = Tuple15.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5);
        t16 = Tuple16.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c');
        t17 = Tuple17.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        t18 = Tuple18.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc");
        t19 = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        t20 = Tuple20.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1));
        t21 = Tuple21.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1);
        t22 = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        t23 = Tuple23.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f);
        t24 = Tuple24.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5);
        t25 = Tuple25.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c');
        t26 = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
    }

    @Test
    public void test_Tuple26_instantiate() {
        Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertThrows(NullPointerException.class, () -> Tuple26.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), null, 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, null, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, null, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, null, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, null, true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, null, ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), null, 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, null, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, null, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, null, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, null, true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, null, ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), null, 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, null, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, null, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, null, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, null, true));
        assertThrows(NullPointerException.class, () -> Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null));

        // Test: 2 null elements
        assertThrows(NullPointerException.class, () -> Tuple26.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null));

        // Test: skipping null check
        new Tuple26<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    @Test
    public void test_Tuple26_get() {
        assertEquals(((byte) 1), t26.a);
        assertEquals(((byte) 1), t26.getA());
        assertEquals(((byte) 1), t26.get(0));
        assertEquals(((short) 1), t26.b);
        assertEquals(((short) 1), t26.getB());
        assertEquals(((short) 1), t26.get(1));
        assertEquals(1, t26.c);
        assertEquals(1, t26.getC());
        assertEquals(1, t26.get(2));
        assertEquals(1L, t26.d);
        assertEquals(1L, t26.getD());
        assertEquals(1L, t26.get(3));
        assertEquals(1.5f, t26.e);
        assertEquals(1.5f, t26.getE());
        assertEquals(1.5f, t26.get(4));
        assertEquals(1.5, t26.f);
        assertEquals(1.5, t26.getF());
        assertEquals(1.5, t26.get(5));
        assertEquals('c', t26.g);
        assertEquals('c', t26.getG());
        assertEquals('c', t26.get(6));
        assertEquals(true, t26.h);
        assertEquals(true, t26.getH());
        assertEquals(true, t26.get(7));
        assertEquals("abc", t26.i);
        assertEquals("abc", t26.getI());
        assertEquals("abc", t26.get(8));
        assertEquals(((byte) 1), t26.j);
        assertEquals(((byte) 1), t26.getJ());
        assertEquals(((byte) 1), t26.get(9));
        assertEquals(((short) 1), t26.k);
        assertEquals(((short) 1), t26.getK());
        assertEquals(((short) 1), t26.get(10));
        assertEquals(1, t26.l);
        assertEquals(1, t26.getL());
        assertEquals(1, t26.get(11));
        assertEquals(1L, t26.m);
        assertEquals(1L, t26.getM());
        assertEquals(1L, t26.get(12));
        assertEquals(1.5f, t26.n);
        assertEquals(1.5f, t26.getN());
        assertEquals(1.5f, t26.get(13));
        assertEquals(1.5, t26.o);
        assertEquals(1.5, t26.getO());
        assertEquals(1.5, t26.get(14));
        assertEquals('c', t26.p);
        assertEquals('c', t26.getP());
        assertEquals('c', t26.get(15));
        assertEquals(true, t26.q);
        assertEquals(true, t26.getQ());
        assertEquals(true, t26.get(16));
        assertEquals("abc", t26.r);
        assertEquals("abc", t26.getR());
        assertEquals("abc", t26.get(17));
        assertEquals(((byte) 1), t26.s);
        assertEquals(((byte) 1), t26.getS());
        assertEquals(((byte) 1), t26.get(18));
        assertEquals(((short) 1), t26.t);
        assertEquals(((short) 1), t26.getT());
        assertEquals(((short) 1), t26.get(19));
        assertEquals(1, t26.u);
        assertEquals(1, t26.getU());
        assertEquals(1, t26.get(20));
        assertEquals(1L, t26.v);
        assertEquals(1L, t26.getV());
        assertEquals(1L, t26.get(21));
        assertEquals(1.5f, t26.w);
        assertEquals(1.5f, t26.getW());
        assertEquals(1.5f, t26.get(22));
        assertEquals(1.5, t26.x);
        assertEquals(1.5, t26.getX());
        assertEquals(1.5, t26.get(23));
        assertEquals('c', t26.y);
        assertEquals('c', t26.getY());
        assertEquals('c', t26.get(24));
        assertEquals(true, t26.z);
        assertEquals(true, t26.getZ());
        assertEquals(true, t26.get(25));
    }

    @Test
    public void test_Tuple26_add() {
        assertEquals(t26.add(t0), t26);

        assertThrows(NullPointerException.class, () -> t26.add((Tuple0) null));
    }

    @Test
    public void test_Tuple26_notEquals() {
        assertNotEquals(t26, Tuple26.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true));
        assertNotEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false));

        assertNotEquals(t26, null);
        assertNotEquals(t26, "tuple");
    }

    @Test
    public void test_Tuple26_clone() {
        Tuple26<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean> tClone = t26.clone();
        assertNotSame(t26, tClone);
        assertEquals(t26, tClone);
    }

    @Test
    public void test_Tuple26_compare() {
        assertTrue(t26.compareTo(Tuple26.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true)) > 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false)) > 0);

        assertTrue(t26.compareTo(Tuple26.of(((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'd', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abd", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'd', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abd", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6, 'c', true)) < 0);
        assertTrue(t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'd', true)) < 0);

        assertThrows(NullPointerException.class, () -> t26.compareTo(null));
    }

    @Test
    public void test_Tuple26_hashCode() {
        Tuple26<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean> another = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertEquals(t26.hashCode(), another.hashCode());

        Tuple26<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean> different;

        different = Tuple26.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true);
        assertNotEquals(t26.hashCode(), different.hashCode());
        different = Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false);
        assertNotEquals(t26.hashCode(), different.hashCode());
    }

}