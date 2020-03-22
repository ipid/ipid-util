package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple2 {

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
    public void test_Tuple2_instantiate() {
        Tuple2.of(((byte) 1), ((short) 1));
        assertThrows(NullPointerException.class, () -> Tuple2.of(null, ((short) 1)));
        assertThrows(NullPointerException.class, () -> Tuple2.of(((byte) 1), null));

        // Test: 2 null elements
        assertThrows(NullPointerException.class, () -> Tuple2.of(null, null));

        // Test: skipping null check
        new Tuple2<C, C>(null, null, null, false);
    }

    @Test
    public void test_Tuple2_get() {
        assertEquals(((byte) 1), t2.a);
        assertEquals(((byte) 1), t2.getA());
        assertEquals(((byte) 1), t2.get(0));
        assertEquals(((short) 1), t2.b);
        assertEquals(((short) 1), t2.getB());
        assertEquals(((short) 1), t2.get(1));
    }

    @Test
    public void test_Tuple2_add() {
        assertEquals(t2.add(t0), t2);
        assertEquals(t2.add(Tuple1.of(1)), t3);
        assertEquals(t2.add(Tuple2.of(1, 1L)), t4);
        assertEquals(t2.add(Tuple3.of(1, 1L, 1.5f)), t5);
        assertEquals(t2.add(Tuple4.of(1, 1L, 1.5f, 1.5)), t6);
        assertEquals(t2.add(Tuple5.of(1, 1L, 1.5f, 1.5, 'c')), t7);
        assertEquals(t2.add(Tuple6.of(1, 1L, 1.5f, 1.5, 'c', true)), t8);

        assertThrows(NullPointerException.class, () -> t2.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple2<C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple3<C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple4<C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple5<C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple6<C, C, C, C, C, C>) null));
    }

    @Test
    public void test_Tuple2_notEquals() {
        assertNotEquals(t2, Tuple2.of(((byte) 0), ((short) 1)));
        assertNotEquals(t2, Tuple2.of(((byte) 1), ((short) 0)));

        assertNotEquals(t2, null);
        assertNotEquals(t2, "tuple");
    }

    @Test
    public void test_Tuple2_clone() {
        Tuple2<Byte, Short> tClone = t2.clone();
        assertNotSame(t2, tClone);
        assertEquals(t2, tClone);
    }

    @Test
    public void test_Tuple2_compare() {
        assertTrue(t2.compareTo(Tuple2.of(((byte) 0), ((short) 1))) > 0);
        assertTrue(t2.compareTo(Tuple2.of(((byte) 1), ((short) 0))) > 0);

        assertTrue(t2.compareTo(Tuple2.of(((byte) 2), ((short) 1))) < 0);
        assertTrue(t2.compareTo(Tuple2.of(((byte) 1), ((short) 2))) < 0);

        assertThrows(NullPointerException.class, () -> t2.compareTo(null));
    }

    @Test
    public void test_Tuple2_hashCode() {
        Tuple2<Byte, Short> another = Tuple2.of(((byte) 1), ((short) 1));
        assertEquals(t2.hashCode(), another.hashCode());

        Tuple2<Byte, Short> different;

        different = Tuple2.of(((byte) 0), ((short) 1));
        assertNotEquals(t2.hashCode(), different.hashCode());
        different = Tuple2.of(((byte) 1), ((short) 0));
        assertNotEquals(t2.hashCode(), different.hashCode());
    }

}