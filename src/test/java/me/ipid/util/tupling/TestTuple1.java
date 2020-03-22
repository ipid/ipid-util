package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple1 {

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
    public void test_Tuple1_instantiate() {
        Tuple1.of(((byte) 1));
        assertThrows(NullPointerException.class, () -> Tuple1.of(null));

        // Test: skipping null check
        new Tuple1<C>(null, null, false);
    }

    @Test
    public void test_Tuple1_get() {
        assertEquals(((byte) 1), t1.a);
        assertEquals(((byte) 1), t1.getA());
        assertEquals(((byte) 1), t1.get(0));
    }

    @Test
    public void test_Tuple1_add() {
        assertEquals(t1.add(t0), t1);
        assertEquals(t1.add(Tuple1.of(((short) 1))), t2);
        assertEquals(t1.add(Tuple2.of(((short) 1), 1)), t3);
        assertEquals(t1.add(Tuple3.of(((short) 1), 1, 1L)), t4);
        assertEquals(t1.add(Tuple4.of(((short) 1), 1, 1L, 1.5f)), t5);
        assertEquals(t1.add(Tuple5.of(((short) 1), 1, 1L, 1.5f, 1.5)), t6);
        assertEquals(t1.add(Tuple6.of(((short) 1), 1, 1L, 1.5f, 1.5, 'c')), t7);
        assertEquals(t1.add(Tuple7.of(((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)), t8);

        assertThrows(NullPointerException.class, () -> t1.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple2<C, C>) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple3<C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple4<C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple5<C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple6<C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple7<C, C, C, C, C, C, C>) null));
    }

    @Test
    public void test_Tuple1_notEquals() {
        assertNotEquals(t1, Tuple1.of(((byte) 0)));

        assertNotEquals(t1, null);
        assertNotEquals(t1, "tuple");
    }

    @Test
    public void test_Tuple1_clone() {
        Tuple1<Byte> tClone = t1.clone();
        assertNotSame(t1, tClone);
        assertEquals(t1, tClone);
    }

    @Test
    public void test_Tuple1_compare() {
        assertTrue(t1.compareTo(Tuple1.of(((byte) 0))) > 0);

        assertTrue(t1.compareTo(Tuple1.of(((byte) 2))) < 0);

        assertThrows(NullPointerException.class, () -> t1.compareTo(null));
    }

    @Test
    public void test_Tuple1_hashCode() {
        Tuple1<Byte> another = Tuple1.of(((byte) 1));
        assertEquals(t1.hashCode(), another.hashCode());

        Tuple1<Byte> different;

        different = Tuple1.of(((byte) 0));
        assertNotEquals(t1.hashCode(), different.hashCode());
    }

}