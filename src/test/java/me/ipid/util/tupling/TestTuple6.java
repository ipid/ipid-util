package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple6 {

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
    public void test_Tuple6_instantiate() {
        Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5);
        assertThrows(NullPointerException.class, () -> Tuple6.of(null, ((short) 1), 1, 1L, 1.5f, 1.5));
        assertThrows(NullPointerException.class, () -> Tuple6.of(((byte) 1), null, 1, 1L, 1.5f, 1.5));
        assertThrows(NullPointerException.class, () -> Tuple6.of(((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5));
        assertThrows(NullPointerException.class, () -> Tuple6.of(((byte) 1), ((short) 1), 1, null, 1.5f, 1.5));
        assertThrows(NullPointerException.class, () -> Tuple6.of(((byte) 1), ((short) 1), 1, 1L, null, 1.5));
        assertThrows(NullPointerException.class, () -> Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, null));

        // Test: 2 null elements
        assertThrows(NullPointerException.class, () -> Tuple6.of(null, ((short) 1), 1, 1L, 1.5f, null));

        // Test: skipping null check
        new Tuple6<C, C, C, C, C, C>(null, null, null, null, null, null, null, false);
    }

    @Test
    public void test_Tuple6_get() {
        assertEquals(((byte) 1), t6.a);
        assertEquals(((byte) 1), t6.getA());
        assertEquals(((byte) 1), t6.get(0));
        assertEquals(((short) 1), t6.b);
        assertEquals(((short) 1), t6.getB());
        assertEquals(((short) 1), t6.get(1));
        assertEquals(1, t6.c);
        assertEquals(1, t6.getC());
        assertEquals(1, t6.get(2));
        assertEquals(1L, t6.d);
        assertEquals(1L, t6.getD());
        assertEquals(1L, t6.get(3));
        assertEquals(1.5f, t6.e);
        assertEquals(1.5f, t6.getE());
        assertEquals(1.5f, t6.get(4));
        assertEquals(1.5, t6.f);
        assertEquals(1.5, t6.getF());
        assertEquals(1.5, t6.get(5));
    }

    @Test
    public void test_Tuple6_add() {
        assertEquals(t6.add(t0), t6);
        assertEquals(t6.add(Tuple1.of('c')), t7);
        assertEquals(t6.add(Tuple2.of('c', true)), t8);

        assertThrows(NullPointerException.class, () -> t6.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t6.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t6.add((Tuple2<C, C>) null));
    }

    @Test
    public void test_Tuple6_notEquals() {
        assertNotEquals(t6, Tuple6.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5));
        assertNotEquals(t6, Tuple6.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5));
        assertNotEquals(t6, Tuple6.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5));
        assertNotEquals(t6, Tuple6.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5));
        assertNotEquals(t6, Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5));
        assertNotEquals(t6, Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4));

        assertNotEquals(t6, null);
        assertNotEquals(t6, "tuple");
    }

    @Test
    public void test_Tuple6_clone() {
        Tuple6<Byte, Short, Integer, Long, Float, Double> tClone = t6.clone();
        assertNotSame(t6, tClone);
        assertEquals(t6, tClone);
    }

    @Test
    public void test_Tuple6_compare() {
        assertTrue(t6.compareTo(Tuple6.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5)) > 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5)) > 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5)) > 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5)) > 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5)) > 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4)) > 0);

        assertTrue(t6.compareTo(Tuple6.of(((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5)) < 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5)) < 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5)) < 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5)) < 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5)) < 0);
        assertTrue(t6.compareTo(Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6)) < 0);

        assertThrows(NullPointerException.class, () -> t6.compareTo(null));
    }

    @Test
    public void test_Tuple6_hashCode() {
        Tuple6<Byte, Short, Integer, Long, Float, Double> another = Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5);
        assertEquals(t6.hashCode(), another.hashCode());

        Tuple6<Byte, Short, Integer, Long, Float, Double> different;

        different = Tuple6.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5);
        assertNotEquals(t6.hashCode(), different.hashCode());
        different = Tuple6.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5);
        assertNotEquals(t6.hashCode(), different.hashCode());
        different = Tuple6.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5);
        assertNotEquals(t6.hashCode(), different.hashCode());
        different = Tuple6.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5);
        assertNotEquals(t6.hashCode(), different.hashCode());
        different = Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5);
        assertNotEquals(t6.hashCode(), different.hashCode());
        different = Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4);
        assertNotEquals(t6.hashCode(), different.hashCode());
    }

}