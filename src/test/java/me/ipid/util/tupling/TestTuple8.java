package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple8 {

    private static class C {
    }

    private static final int ELEMENT_NUM_MAX = 8;

    private static Tuple0 t0;
    private static Tuple1<Byte> t1;
    private static Tuple2<Byte, Short> t2;
    private static Tuple3<Byte, Short, Integer> t3;
    private static Tuple4<Byte, Short, Integer, Long> t4;
    private static Tuple5<Byte, Short, Integer, Long, Float> t5;
    private static Tuple6<Byte, Short, Integer, Long, Float, Double> t6;
    private static Tuple7<Byte, Short, Integer, Long, Float, Double, Character> t7;
    private static Tuple8<Byte, Short, Integer, Long, Float, Double, Character, Boolean> t8;

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
    }

    @Test
    public void test_Tuple8_instantiate() {
        Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertThrows(NullPointerException.class, () -> Tuple8.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple8.of(((byte) 1), null, 1, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple8.of(((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple8.of(((byte) 1), ((short) 1), 1, null, 1.5f, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple8.of(((byte) 1), ((short) 1), 1, 1L, null, 1.5, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, null, 'c', true));
        assertThrows(NullPointerException.class, () -> Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, null, true));
        assertThrows(NullPointerException.class, () -> Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null));

        // Test: 2 null elements
        assertThrows(NullPointerException.class, () -> Tuple8.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c', null));

        // Test: skipping null check
        new Tuple8<C, C, C, C, C, C, C, C>(null, null, null, null, null, null, null, null, null, false);
    }

    @Test
    public void test_Tuple8_get() {
        assertEquals(((byte) 1), t8.a);
        assertEquals(((byte) 1), t8.getA());
        assertEquals(((byte) 1), t8.get(0));
        assertEquals(((short) 1), t8.b);
        assertEquals(((short) 1), t8.getB());
        assertEquals(((short) 1), t8.get(1));
        assertEquals(1, t8.c);
        assertEquals(1, t8.getC());
        assertEquals(1, t8.get(2));
        assertEquals(1L, t8.d);
        assertEquals(1L, t8.getD());
        assertEquals(1L, t8.get(3));
        assertEquals(1.5f, t8.e);
        assertEquals(1.5f, t8.getE());
        assertEquals(1.5f, t8.get(4));
        assertEquals(1.5, t8.f);
        assertEquals(1.5, t8.getF());
        assertEquals(1.5, t8.get(5));
        assertEquals('c', t8.g);
        assertEquals('c', t8.getG());
        assertEquals('c', t8.get(6));
        assertEquals(true, t8.h);
        assertEquals(true, t8.getH());
        assertEquals(true, t8.get(7));
    }

    @Test
    public void test_Tuple8_add() {
        assertEquals(t8.add(t0), t8);

        assertThrows(NullPointerException.class, () -> t8.add((Tuple0) null));
    }

    @Test
    public void test_Tuple8_notEquals() {
        assertNotEquals(t8, Tuple8.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t8, Tuple8.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t8, Tuple8.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t8, Tuple8.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true));
        assertNotEquals(t8, Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true));
        assertNotEquals(t8, Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true));
        assertNotEquals(t8, Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true));
        assertNotEquals(t8, Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false));

        assertNotEquals(t8, null);
        assertNotEquals(t8, "tuple");
    }

    @Test
    public void test_Tuple8_clone() {
        Tuple8<Byte, Short, Integer, Long, Float, Double, Character, Boolean> tClone = t8.clone();
        assertNotSame(t8, tClone);
        assertEquals(t8, tClone);
    }

    @Test
    public void test_Tuple8_compare() {
        assertTrue(t8.compareTo(Tuple8.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true)) > 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true)) > 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true)) > 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true)) > 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false)) > 0);

        assertTrue(t8.compareTo(Tuple8.of(((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5, 'c', true)) < 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5, 'c', true)) < 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6, 'c', true)) < 0);
        assertTrue(t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'd', true)) < 0);

        assertThrows(NullPointerException.class, () -> t8.compareTo(null));
    }

    @Test
    public void test_Tuple8_hashCode() {
        Tuple8<Byte, Short, Integer, Long, Float, Double, Character, Boolean> another = Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertEquals(t8.hashCode(), another.hashCode());

        Tuple8<Byte, Short, Integer, Long, Float, Double, Character, Boolean> different;

        different = Tuple8.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t8.hashCode(), different.hashCode());
        different = Tuple8.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t8.hashCode(), different.hashCode());
        different = Tuple8.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t8.hashCode(), different.hashCode());
        different = Tuple8.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c', true);
        assertNotEquals(t8.hashCode(), different.hashCode());
        different = Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c', true);
        assertNotEquals(t8.hashCode(), different.hashCode());
        different = Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c', true);
        assertNotEquals(t8.hashCode(), different.hashCode());
        different = Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b', true);
        assertNotEquals(t8.hashCode(), different.hashCode());
        different = Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', false);
        assertNotEquals(t8.hashCode(), different.hashCode());
    }

}