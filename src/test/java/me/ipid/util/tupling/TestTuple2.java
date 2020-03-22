package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored"})
class TestTuple2 {

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
        assertEquals(t2.add(Tuple7.of(1, 1L, 1.5f, 1.5, 'c', true, "abc")), t9);
        assertEquals(t2.add(Tuple8.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))), t10);
        assertEquals(t2.add(Tuple9.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1))), t11);
        assertEquals(t2.add(Tuple10.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1)), t12);
        assertEquals(t2.add(Tuple11.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)), t13);
        assertEquals(t2.add(Tuple12.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f)), t14);
        assertEquals(t2.add(Tuple13.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5)), t15);
        assertEquals(t2.add(Tuple14.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c')), t16);
        assertEquals(t2.add(Tuple15.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)), t17);
        assertEquals(t2.add(Tuple16.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc")), t18);
        assertEquals(t2.add(Tuple17.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))), t19);
        assertEquals(t2.add(Tuple18.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1))), t20);
        assertEquals(t2.add(Tuple19.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1)), t21);
        assertEquals(t2.add(Tuple20.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)), t22);
        assertEquals(t2.add(Tuple21.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f)), t23);
        assertEquals(t2.add(Tuple22.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5)), t24);
        assertEquals(t2.add(Tuple23.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c')), t25);
        assertEquals(t2.add(Tuple24.of(1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)), t26);

        assertThrows(NullPointerException.class, () -> t2.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple2<C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple3<C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple4<C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple5<C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple6<C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple7<C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple8<C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple9<C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple10<C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple11<C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple12<C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple13<C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple14<C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple15<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple16<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple17<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple18<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple19<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple20<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple21<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple22<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple23<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple24<C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C, C>) null));
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