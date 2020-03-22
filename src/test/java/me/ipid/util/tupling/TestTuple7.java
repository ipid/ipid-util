package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple7 {

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
    public void test_Tuple7_instantiate() {
        Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c');
        assertThrows(NullPointerException.class, () -> Tuple7.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, 'c'));
        assertThrows(NullPointerException.class, () -> Tuple7.of(((byte) 1), null, 1, 1L, 1.5f, 1.5, 'c'));
        assertThrows(NullPointerException.class, () -> Tuple7.of(((byte) 1), ((short) 1), null, 1L, 1.5f, 1.5, 'c'));
        assertThrows(NullPointerException.class, () -> Tuple7.of(((byte) 1), ((short) 1), 1, null, 1.5f, 1.5, 'c'));
        assertThrows(NullPointerException.class, () -> Tuple7.of(((byte) 1), ((short) 1), 1, 1L, null, 1.5, 'c'));
        assertThrows(NullPointerException.class, () -> Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, null, 'c'));
        assertThrows(NullPointerException.class, () -> Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, null));

        // Test: 2 null elements
        assertThrows(NullPointerException.class, () -> Tuple7.of(null, ((short) 1), 1, 1L, 1.5f, 1.5, null));

        // Test: skipping null check
        new Tuple7<C, C, C, C, C, C, C>(null, null, null, null, null, null, null, null, false);
    }

    @Test
    public void test_Tuple7_get() {
        assertEquals(((byte) 1), t7.a);
        assertEquals(((byte) 1), t7.getA());
        assertEquals(((byte) 1), t7.get(0));
        assertEquals(((short) 1), t7.b);
        assertEquals(((short) 1), t7.getB());
        assertEquals(((short) 1), t7.get(1));
        assertEquals(1, t7.c);
        assertEquals(1, t7.getC());
        assertEquals(1, t7.get(2));
        assertEquals(1L, t7.d);
        assertEquals(1L, t7.getD());
        assertEquals(1L, t7.get(3));
        assertEquals(1.5f, t7.e);
        assertEquals(1.5f, t7.getE());
        assertEquals(1.5f, t7.get(4));
        assertEquals(1.5, t7.f);
        assertEquals(1.5, t7.getF());
        assertEquals(1.5, t7.get(5));
        assertEquals('c', t7.g);
        assertEquals('c', t7.getG());
        assertEquals('c', t7.get(6));
    }

    @Test
    public void test_Tuple7_add() {
        assertEquals(t7.add(t0), t7);
        assertEquals(t7.add(Tuple1.of(true)), t8);

        assertThrows(NullPointerException.class, () -> t7.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t7.add((Tuple1<C>) null));
    }

    @Test
    public void test_Tuple7_notEquals() {
        assertNotEquals(t7, Tuple7.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c'));
        assertNotEquals(t7, Tuple7.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c'));
        assertNotEquals(t7, Tuple7.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c'));
        assertNotEquals(t7, Tuple7.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c'));
        assertNotEquals(t7, Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c'));
        assertNotEquals(t7, Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c'));
        assertNotEquals(t7, Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b'));

        assertNotEquals(t7, null);
        assertNotEquals(t7, "tuple");
    }

    @Test
    public void test_Tuple7_clone() {
        Tuple7<Byte, Short, Integer, Long, Float, Double, Character> tClone = t7.clone();
        assertNotSame(t7, tClone);
        assertEquals(t7, tClone);
    }

    @Test
    public void test_Tuple7_compare() {
        assertTrue(t7.compareTo(Tuple7.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c')) > 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c')) > 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c')) > 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c')) > 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c')) > 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c')) > 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b')) > 0);

        assertTrue(t7.compareTo(Tuple7.of(((byte) 2), ((short) 1), 1, 1L, 1.5f, 1.5, 'c')) < 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 2), 1, 1L, 1.5f, 1.5, 'c')) < 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 2, 1L, 1.5f, 1.5, 'c')) < 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 1, 2L, 1.5f, 1.5, 'c')) < 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.6f, 1.5, 'c')) < 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.6, 'c')) < 0);
        assertTrue(t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'd')) < 0);

        assertThrows(NullPointerException.class, () -> t7.compareTo(null));
    }

    @Test
    public void test_Tuple7_hashCode() {
        Tuple7<Byte, Short, Integer, Long, Float, Double, Character> another = Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c');
        assertEquals(t7.hashCode(), another.hashCode());

        Tuple7<Byte, Short, Integer, Long, Float, Double, Character> different;

        different = Tuple7.of(((byte) 0), ((short) 1), 1, 1L, 1.5f, 1.5, 'c');
        assertNotEquals(t7.hashCode(), different.hashCode());
        different = Tuple7.of(((byte) 1), ((short) 0), 1, 1L, 1.5f, 1.5, 'c');
        assertNotEquals(t7.hashCode(), different.hashCode());
        different = Tuple7.of(((byte) 1), ((short) 1), 0, 1L, 1.5f, 1.5, 'c');
        assertNotEquals(t7.hashCode(), different.hashCode());
        different = Tuple7.of(((byte) 1), ((short) 1), 1, 0L, 1.5f, 1.5, 'c');
        assertNotEquals(t7.hashCode(), different.hashCode());
        different = Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.4f, 1.5, 'c');
        assertNotEquals(t7.hashCode(), different.hashCode());
        different = Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.4, 'c');
        assertNotEquals(t7.hashCode(), different.hashCode());
        different = Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'b');
        assertNotEquals(t7.hashCode(), different.hashCode());
    }

}