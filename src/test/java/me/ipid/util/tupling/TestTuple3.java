package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple3 {

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
    public void test_Tuple3_instantiate() {
        Tuple3.of(((byte) 1), ((short) 1), 1);
        assertThrows(NullPointerException.class, () -> Tuple3.of(null, ((short) 1), 1));
        assertThrows(NullPointerException.class, () -> Tuple3.of(((byte) 1), null, 1));
        assertThrows(NullPointerException.class, () -> Tuple3.of(((byte) 1), ((short) 1), null));

        // Test: 2 null elements
        assertThrows(NullPointerException.class, () -> Tuple3.of(null, ((short) 1), null));

        // Test: skipping null check
        new Tuple3<C, C, C>(null, null, null, null, false);
    }

    @Test
    public void test_Tuple3_get() {
        assertEquals(((byte) 1), t3.a);
        assertEquals(((byte) 1), t3.getA());
        assertEquals(((byte) 1), t3.get(0));
        assertEquals(((short) 1), t3.b);
        assertEquals(((short) 1), t3.getB());
        assertEquals(((short) 1), t3.get(1));
        assertEquals(1, t3.c);
        assertEquals(1, t3.getC());
        assertEquals(1, t3.get(2));
    }

    @Test
    public void test_Tuple3_add() {
        assertEquals(t3.add(t0), t3);
        assertEquals(t3.add(Tuple1.of(1L)), t4);
        assertEquals(t3.add(Tuple2.of(1L, 1.5f)), t5);
        assertEquals(t3.add(Tuple3.of(1L, 1.5f, 1.5)), t6);
        assertEquals(t3.add(Tuple4.of(1L, 1.5f, 1.5, 'c')), t7);
        assertEquals(t3.add(Tuple5.of(1L, 1.5f, 1.5, 'c', true)), t8);

        assertThrows(NullPointerException.class, () -> t3.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t3.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t3.add((Tuple2<C, C>) null));
        assertThrows(NullPointerException.class, () -> t3.add((Tuple3<C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t3.add((Tuple4<C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t3.add((Tuple5<C, C, C, C, C>) null));
    }

    @Test
    public void test_Tuple3_notEquals() {
        assertNotEquals(t3, Tuple3.of(((byte) 0), ((short) 1), 1));
        assertNotEquals(t3, Tuple3.of(((byte) 1), ((short) 0), 1));
        assertNotEquals(t3, Tuple3.of(((byte) 1), ((short) 1), 0));

        assertNotEquals(t3, null);
        assertNotEquals(t3, "tuple");
    }

    @Test
    public void test_Tuple3_clone() {
        Tuple3<Byte, Short, Integer> tClone = t3.clone();
        assertNotSame(t3, tClone);
        assertEquals(t3, tClone);
    }

    @Test
    public void test_Tuple3_compare() {
        assertTrue(t3.compareTo(Tuple3.of(((byte) 0), ((short) 1), 1)) > 0);
        assertTrue(t3.compareTo(Tuple3.of(((byte) 1), ((short) 0), 1)) > 0);
        assertTrue(t3.compareTo(Tuple3.of(((byte) 1), ((short) 1), 0)) > 0);

        assertTrue(t3.compareTo(Tuple3.of(((byte) 2), ((short) 1), 1)) < 0);
        assertTrue(t3.compareTo(Tuple3.of(((byte) 1), ((short) 2), 1)) < 0);
        assertTrue(t3.compareTo(Tuple3.of(((byte) 1), ((short) 1), 2)) < 0);

        assertThrows(NullPointerException.class, () -> t3.compareTo(null));
    }

    @Test
    public void test_Tuple3_hashCode() {
        Tuple3<Byte, Short, Integer> another = Tuple3.of(((byte) 1), ((short) 1), 1);
        assertEquals(t3.hashCode(), another.hashCode());

        Tuple3<Byte, Short, Integer> different;

        different = Tuple3.of(((byte) 0), ((short) 1), 1);
        assertNotEquals(t3.hashCode(), different.hashCode());
        different = Tuple3.of(((byte) 1), ((short) 0), 1);
        assertNotEquals(t3.hashCode(), different.hashCode());
        different = Tuple3.of(((byte) 1), ((short) 1), 0);
        assertNotEquals(t3.hashCode(), different.hashCode());
    }

}