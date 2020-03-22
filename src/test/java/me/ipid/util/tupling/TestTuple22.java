package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple22 {

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
    public void test_Tuple22_instantiate() {
        Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertThrows(NullPointerException.class, () -> Tuple22.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), null, 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, null, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, null, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, null, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, null, true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, null, ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), null, 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, null, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, null, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, null, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, null, true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, null, ((byte) 1), ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", null, ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), null, 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), null, 1L));
        assertThrows(NullPointerException.class, () -> Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, null));

        // Test: 2 null elements
        assertThrows(NullPointerException.class, () -> Tuple22.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, null));

        // Test: skipping null check
        new Tuple22<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    @Test
    public void test_Tuple22_get() {
        assertEquals(((byte) 1), t22.a);
        assertEquals(((byte) 1), t22.getA());
        assertEquals(((byte) 1), t22.get(0));
        assertEquals(((short) 1), t22.b);
        assertEquals(((short) 1), t22.getB());
        assertEquals(((short) 1), t22.get(1));
        assertEquals(1, t22.c);
        assertEquals(1, t22.getC());
        assertEquals(1, t22.get(2));
        assertEquals(1L, t22.d);
        assertEquals(1L, t22.getD());
        assertEquals(1L, t22.get(3));
        assertEquals(1.5f, t22.e);
        assertEquals(1.5f, t22.getE());
        assertEquals(1.5f, t22.get(4));
        assertEquals(1.5, t22.f);
        assertEquals(1.5, t22.getF());
        assertEquals(1.5, t22.get(5));
        assertEquals('c', t22.g);
        assertEquals('c', t22.getG());
        assertEquals('c', t22.get(6));
        assertEquals(true, t22.h);
        assertEquals(true, t22.getH());
        assertEquals(true, t22.get(7));
        assertEquals("abc", t22.i);
        assertEquals("abc", t22.getI());
        assertEquals("abc", t22.get(8));
        assertEquals(((byte) 1), t22.j);
        assertEquals(((byte) 1), t22.getJ());
        assertEquals(((byte) 1), t22.get(9));
        assertEquals(((short) 1), t22.k);
        assertEquals(((short) 1), t22.getK());
        assertEquals(((short) 1), t22.get(10));
        assertEquals(1, t22.l);
        assertEquals(1, t22.getL());
        assertEquals(1, t22.get(11));
        assertEquals(1L, t22.m);
        assertEquals(1L, t22.getM());
        assertEquals(1L, t22.get(12));
        assertEquals(1.5f, t22.n);
        assertEquals(1.5f, t22.getN());
        assertEquals(1.5f, t22.get(13));
        assertEquals(1.5, t22.o);
        assertEquals(1.5, t22.getO());
        assertEquals(1.5, t22.get(14));
        assertEquals('c', t22.p);
        assertEquals('c', t22.getP());
        assertEquals('c', t22.get(15));
        assertEquals(true, t22.q);
        assertEquals(true, t22.getQ());
        assertEquals(true, t22.get(16));
        assertEquals("abc", t22.r);
        assertEquals("abc", t22.getR());
        assertEquals("abc", t22.get(17));
        assertEquals(((byte) 1), t22.s);
        assertEquals(((byte) 1), t22.getS());
        assertEquals(((byte) 1), t22.get(18));
        assertEquals(((short) 1), t22.t);
        assertEquals(((short) 1), t22.getT());
        assertEquals(((short) 1), t22.get(19));
        assertEquals(1, t22.u);
        assertEquals(1, t22.getU());
        assertEquals(1, t22.get(20));
        assertEquals(1L, t22.v);
        assertEquals(1L, t22.getV());
        assertEquals(1L, t22.get(21));
    }

    @Test
    public void test_Tuple22_add() {
        assertEquals(t22.add(t0), t22);
        assertEquals(t22.add(Tuple1.of(1.5f)), t23);
        assertEquals(t22.add(Tuple2.of(1.5f, 1.5)), t24);
        assertEquals(t22.add(Tuple3.of(1.5f, 1.5, 'c')), t25);
        assertEquals(t22.add(Tuple4.of(1.5f, 1.5, 'c', true)), t26);

        assertThrows(NullPointerException.class, () -> t22.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t22.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t22.add((Tuple2<C, C>) null));
        assertThrows(NullPointerException.class, () -> t22.add((Tuple3<C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t22.add((Tuple4<C, C, C, C>) null));
    }

    @Test
    public void test_Tuple22_notEquals() {
        assertNotEquals(t22, Tuple22.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L));
        assertNotEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L));

        assertNotEquals(t22, null);
        assertNotEquals(t22, "tuple");
    }

    @Test
    public void test_Tuple22_clone() {
        Tuple22<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long> tClone = t22.clone();
        assertNotSame(t22, tClone);
        assertEquals(t22, tClone);
    }

    @Test
    public void test_Tuple22_compare() {
        assertTrue(t22.compareTo(Tuple22.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L)) > 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L)) > 0);

        assertTrue(t22.compareTo(Tuple22.of(((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'd', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abd", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'd', true, "abc", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abd", ((byte) 1), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 2), ((short) 1), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 2), 1, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 2, 1L)) < 0);
        assertTrue(t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 2L)) < 0);

        assertThrows(NullPointerException.class, () -> t22.compareTo(null));
    }

    @Test
    public void test_Tuple22_hashCode() {
        Tuple22<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long> another = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertEquals(t22.hashCode(), another.hashCode());

        Tuple22<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long> different;

        different = Tuple22.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L);
        assertNotEquals(t22.hashCode(), different.hashCode());
        different = Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L);
        assertNotEquals(t22.hashCode(), different.hashCode());
    }

}