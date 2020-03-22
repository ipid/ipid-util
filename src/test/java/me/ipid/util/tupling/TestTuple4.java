package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple4 {

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
    public void test_Tuple4_instantiate() {
        Tuple4.of(((byte) 1), ((short) 1), 1, 1L);
        assertThrows(NullPointerException.class, () -> Tuple4.of(null, ((short) 1), 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple4.of(((byte) 1), null, 1, 1L));
        assertThrows(NullPointerException.class, () -> Tuple4.of(((byte) 1), ((short) 1), null, 1L));
        assertThrows(NullPointerException.class, () -> Tuple4.of(((byte) 1), ((short) 1), 1, null));

        // Test: 2 null elements
        assertThrows(NullPointerException.class, () -> Tuple4.of(null, ((short) 1), 1, null));

        // Test: skipping null check
        new Tuple4<C, C, C, C>(null, null, null, null, null, false);
    }

    @Test
    public void test_Tuple4_get() {
        assertEquals(((byte) 1), t4.a);
        assertEquals(((byte) 1), t4.getA());
        assertEquals(((byte) 1), t4.get(0));
        assertEquals(((short) 1), t4.b);
        assertEquals(((short) 1), t4.getB());
        assertEquals(((short) 1), t4.get(1));
        assertEquals(1, t4.c);
        assertEquals(1, t4.getC());
        assertEquals(1, t4.get(2));
        assertEquals(1L, t4.d);
        assertEquals(1L, t4.getD());
        assertEquals(1L, t4.get(3));
    }

    @Test
    public void test_Tuple4_add() {
        assertEquals(t4.add(t0), t4);
        assertEquals(t4.add(Tuple1.of(1.5f)), t5);
        assertEquals(t4.add(Tuple2.of(1.5f, 1.5)), t6);
        assertEquals(t4.add(Tuple3.of(1.5f, 1.5, 'c')), t7);
        assertEquals(t4.add(Tuple4.of(1.5f, 1.5, 'c', true)), t8);

        assertThrows(NullPointerException.class, () -> t4.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t4.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t4.add((Tuple2<C, C>) null));
        assertThrows(NullPointerException.class, () -> t4.add((Tuple3<C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t4.add((Tuple4<C, C, C, C>) null));
    }

    @Test
    public void test_Tuple4_notEquals() {
        assertNotEquals(t4, Tuple4.of(((byte) 0), ((short) 1), 1, 1L));
        assertNotEquals(t4, Tuple4.of(((byte) 1), ((short) 0), 1, 1L));
        assertNotEquals(t4, Tuple4.of(((byte) 1), ((short) 1), 0, 1L));
        assertNotEquals(t4, Tuple4.of(((byte) 1), ((short) 1), 1, 0L));

        assertNotEquals(t4, null);
        assertNotEquals(t4, "tuple");
    }

    @Test
    public void test_Tuple4_clone() {
        Tuple4<Byte, Short, Integer, Long> tClone = t4.clone();
        assertNotSame(t4, tClone);
        assertEquals(t4, tClone);
    }

    @Test
    public void test_Tuple4_compare() {
        assertTrue(t4.compareTo(Tuple4.of(((byte) 0), ((short) 1), 1, 1L)) > 0);
        assertTrue(t4.compareTo(Tuple4.of(((byte) 1), ((short) 0), 1, 1L)) > 0);
        assertTrue(t4.compareTo(Tuple4.of(((byte) 1), ((short) 1), 0, 1L)) > 0);
        assertTrue(t4.compareTo(Tuple4.of(((byte) 1), ((short) 1), 1, 0L)) > 0);

        assertTrue(t4.compareTo(Tuple4.of(((byte) 2), ((short) 1), 1, 1L)) < 0);
        assertTrue(t4.compareTo(Tuple4.of(((byte) 1), ((short) 2), 1, 1L)) < 0);
        assertTrue(t4.compareTo(Tuple4.of(((byte) 1), ((short) 1), 2, 1L)) < 0);
        assertTrue(t4.compareTo(Tuple4.of(((byte) 1), ((short) 1), 1, 2L)) < 0);

        assertThrows(NullPointerException.class, () -> t4.compareTo(null));
    }

    @Test
    public void test_Tuple4_hashCode() {
        Tuple4<Byte, Short, Integer, Long> another = Tuple4.of(((byte) 1), ((short) 1), 1, 1L);
        assertEquals(t4.hashCode(), another.hashCode());

        Tuple4<Byte, Short, Integer, Long> different;

        different = Tuple4.of(((byte) 0), ((short) 1), 1, 1L);
        assertNotEquals(t4.hashCode(), different.hashCode());
        different = Tuple4.of(((byte) 1), ((short) 0), 1, 1L);
        assertNotEquals(t4.hashCode(), different.hashCode());
        different = Tuple4.of(((byte) 1), ((short) 1), 0, 1L);
        assertNotEquals(t4.hashCode(), different.hashCode());
        different = Tuple4.of(((byte) 1), ((short) 1), 1, 0L);
        assertNotEquals(t4.hashCode(), different.hashCode());
    }

}