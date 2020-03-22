package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple19 {

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
    public void test_Tuple19_instantiate() {
        Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertThrows(NullPointerException.class, () -> Tuple19.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), null, 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, null, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, null, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, null, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, null, true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, null, ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), null, 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, null, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, null, 1.5, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, null, 'c', true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, null, true, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null, "abc", ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, null, ((byte) 1)));
        assertThrows(NullPointerException.class, () -> Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", null));

        // Test: 2 null elements
        assertThrows(NullPointerException.class, () -> Tuple19.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", null));

        // Test: skipping null check
        new Tuple19<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false);
    }

    @Test
    public void test_Tuple19_get() {
        assertEquals(((byte) 1), t19.a);
        assertEquals(((byte) 1), t19.getA());
        assertEquals(((byte) 1), t19.get(0));
        assertEquals(((short) 1), t19.b);
        assertEquals(((short) 1), t19.getB());
        assertEquals(((short) 1), t19.get(1));
        assertEquals(1, t19.c);
        assertEquals(1, t19.getC());
        assertEquals(1, t19.get(2));
        assertEquals(1L, t19.d);
        assertEquals(1L, t19.getD());
        assertEquals(1L, t19.get(3));
        assertEquals(1.5f, t19.e);
        assertEquals(1.5f, t19.getE());
        assertEquals(1.5f, t19.get(4));
        assertEquals(1.5, t19.f);
        assertEquals(1.5, t19.getF());
        assertEquals(1.5, t19.get(5));
        assertEquals('c', t19.g);
        assertEquals('c', t19.getG());
        assertEquals('c', t19.get(6));
        assertEquals(true, t19.h);
        assertEquals(true, t19.getH());
        assertEquals(true, t19.get(7));
        assertEquals("abc", t19.i);
        assertEquals("abc", t19.getI());
        assertEquals("abc", t19.get(8));
        assertEquals(((byte) 1), t19.j);
        assertEquals(((byte) 1), t19.getJ());
        assertEquals(((byte) 1), t19.get(9));
        assertEquals(((short) 1), t19.k);
        assertEquals(((short) 1), t19.getK());
        assertEquals(((short) 1), t19.get(10));
        assertEquals(1, t19.l);
        assertEquals(1, t19.getL());
        assertEquals(1, t19.get(11));
        assertEquals(1L, t19.m);
        assertEquals(1L, t19.getM());
        assertEquals(1L, t19.get(12));
        assertEquals(1.5f, t19.n);
        assertEquals(1.5f, t19.getN());
        assertEquals(1.5f, t19.get(13));
        assertEquals(1.5, t19.o);
        assertEquals(1.5, t19.getO());
        assertEquals(1.5, t19.get(14));
        assertEquals('c', t19.p);
        assertEquals('c', t19.getP());
        assertEquals('c', t19.get(15));
        assertEquals(true, t19.q);
        assertEquals(true, t19.getQ());
        assertEquals(true, t19.get(16));
        assertEquals("abc", t19.r);
        assertEquals("abc", t19.getR());
        assertEquals("abc", t19.get(17));
        assertEquals(((byte) 1), t19.s);
        assertEquals(((byte) 1), t19.getS());
        assertEquals(((byte) 1), t19.get(18));
    }

    @Test
    public void test_Tuple19_add() {
        assertEquals(t19.add(t0), t19);
        assertEquals(t19.add(Tuple1.of(((short) 1))), t20);
        assertEquals(t19.add(Tuple2.of(((short) 1), 1)), t21);
        assertEquals(t19.add(Tuple3.of(((short) 1), 1, 1L)), t22);
        assertEquals(t19.add(Tuple4.of(((short) 1), 1, 1L, 1.5f)), t23);
        assertEquals(t19.add(Tuple5.of(((short) 1), 1, 1L, 1.5f, 1.5)), t24);
        assertEquals(t19.add(Tuple6.of(((short) 1), 1, 1L, 1.5f, 1.5, 'c')), t25);
        assertEquals(t19.add(Tuple7.of(((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)), t26);

        assertThrows(NullPointerException.class, () -> t19.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t19.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t19.add((Tuple2<C, C>) null));
        assertThrows(NullPointerException.class, () -> t19.add((Tuple3<C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t19.add((Tuple4<C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t19.add((Tuple5<C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t19.add((Tuple6<C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t19.add((Tuple7<C, C, C, C, C, C, C>) null));
    }

    @Test
    public void test_Tuple19_notEquals() {
        assertNotEquals(t19, Tuple19.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1)));
        assertNotEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0)));

        assertNotEquals(t19, null);
        assertNotEquals(t19, "tuple");
    }

    @Test
    public void test_Tuple19_clone() {
        Tuple19<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte> tClone = t19.clone();
        assertNotSame(t19, tClone);
        assertEquals(t19, tClone);
    }

    @Test
    public void test_Tuple19_compare() {
        assertTrue(t19.compareTo(Tuple19.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1))) > 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0))) > 0);

        assertTrue(t19.compareTo(Tuple19.of(((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'd', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abd", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6, 'c', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'd', true, "abc", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abd", ((byte) 1))) < 0);
        assertTrue(t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 2))) < 0);

        assertThrows(NullPointerException.class, () -> t19.compareTo(null));
    }

    @Test
    public void test_Tuple19_hashCode() {
        Tuple19<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte> another = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertEquals(t19.hashCode(), another.hashCode());

        Tuple19<Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, Byte> different;

        different = Tuple19.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false, "abc", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abb", ((byte) 1));
        assertNotEquals(t19.hashCode(), different.hashCode());
        different = Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 0));
        assertNotEquals(t19.hashCode(), different.hashCode());
    }

}