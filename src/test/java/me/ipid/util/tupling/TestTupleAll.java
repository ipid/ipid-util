package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"UnstableApiUsage"})
class TestTupleAll {

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
    public void test_Tupling_getSize() {
        assertEquals(t0.getValueList().length, t0.getSize());
        assertEquals(t1.getValueList().length, t1.getSize());
        assertEquals(t2.getValueList().length, t2.getSize());
        assertEquals(t3.getValueList().length, t3.getSize());
        assertEquals(t4.getValueList().length, t4.getSize());
        assertEquals(t5.getValueList().length, t5.getSize());
        assertEquals(t6.getValueList().length, t6.getSize());
        assertEquals(t7.getValueList().length, t7.getSize());
        assertEquals(t8.getValueList().length, t8.getSize());
        assertEquals(t9.getValueList().length, t9.getSize());
        assertEquals(t10.getValueList().length, t10.getSize());
        assertEquals(t11.getValueList().length, t11.getSize());
        assertEquals(t12.getValueList().length, t12.getSize());
        assertEquals(t13.getValueList().length, t13.getSize());
        assertEquals(t14.getValueList().length, t14.getSize());
        assertEquals(t15.getValueList().length, t15.getSize());
        assertEquals(t16.getValueList().length, t16.getSize());
        assertEquals(t17.getValueList().length, t17.getSize());
        assertEquals(t18.getValueList().length, t18.getSize());
        assertEquals(t19.getValueList().length, t19.getSize());
        assertEquals(t20.getValueList().length, t20.getSize());
        assertEquals(t21.getValueList().length, t21.getSize());
        assertEquals(t22.getValueList().length, t22.getSize());
        assertEquals(t23.getValueList().length, t23.getSize());
        assertEquals(t24.getValueList().length, t24.getSize());
        assertEquals(t25.getValueList().length, t25.getSize());
        assertEquals(t26.getValueList().length, t26.getSize());
    }

    @Test
    public void test_Tupling_iterator() {
        Streams.mapWithIndex(Streams.stream(t26), (elem, index) -> {
            assertEquals(elem, t26.getValueList()[(int)index]);
            return null;
        });
    }

    @Test
    public void test_elements() {
        assertArrayEquals(new Object[]{  }, t0.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1) }, t1.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1) }, t2.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1 }, t3.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L }, t4.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f }, t5.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5 }, t6.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c' }, t7.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true }, t8.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc" }, t9.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1) }, t10.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1) }, t11.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1 }, t12.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L }, t13.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f }, t14.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5 }, t15.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c' }, t16.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true }, t17.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc" }, t18.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1) }, t19.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1) }, t20.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1 }, t21.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L }, t22.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f }, t23.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5 }, t24.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c' }, t25.getValueList());
        assertArrayEquals(new Object[]{ ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true }, t26.getValueList());
    }

    public void checkGetException(Tupling tuple, int elementNum) {
        // Test: normal get
        for (int i = 0; i < elementNum; i++) {
            tuple.get(i);
        }

        // Test: get element that is out of bound
        assertThrows(IllegalArgumentException.class, () -> tuple.get(-2));
        assertThrows(IllegalArgumentException.class, () -> tuple.get(-1));
        for (int i = elementNum; i <= ELEMENT_NUM_MAX + 1; i++) {
            final int toGet = i;
            assertThrows(IllegalArgumentException.class, () -> tuple.get(toGet));
        }
    }

    @Test
    public void test_AllTuple_get() {
        checkGetException(t0, 0);
        checkGetException(t1, 1);
        checkGetException(t2, 2);
        checkGetException(t3, 3);
        checkGetException(t4, 4);
        checkGetException(t5, 5);
        checkGetException(t6, 6);
        checkGetException(t7, 7);
        checkGetException(t8, 8);
        checkGetException(t9, 9);
        checkGetException(t10, 10);
        checkGetException(t11, 11);
        checkGetException(t12, 12);
        checkGetException(t13, 13);
        checkGetException(t14, 14);
        checkGetException(t15, 15);
        checkGetException(t16, 16);
        checkGetException(t17, 17);
        checkGetException(t18, 18);
        checkGetException(t19, 19);
        checkGetException(t20, 20);
        checkGetException(t21, 21);
        checkGetException(t22, 22);
        checkGetException(t23, 23);
        checkGetException(t24, 24);
        checkGetException(t25, 25);
        checkGetException(t26, 26);
    }

    @Test
    public void test_AllTuple_equals() {
        assertEquals(t0, t0);
        assertEquals(t0, Tuple0.of());
        assertEquals(t1, t1);
        assertEquals(t1, Tuple1.of(((byte) 1)));
        assertEquals(t2, t2);
        assertEquals(t2, Tuple2.of(((byte) 1), ((short) 1)));
        assertEquals(t3, t3);
        assertEquals(t3, Tuple3.of(((byte) 1), ((short) 1), 1));
        assertEquals(t4, t4);
        assertEquals(t4, Tuple4.of(((byte) 1), ((short) 1), 1, 1L));
        assertEquals(t5, t5);
        assertEquals(t5, Tuple5.of(((byte) 1), ((short) 1), 1, 1L, 1.5f));
        assertEquals(t6, t6);
        assertEquals(t6, Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5));
        assertEquals(t7, t7);
        assertEquals(t7, Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c'));
        assertEquals(t8, t8);
        assertEquals(t8, Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertEquals(t9, t9);
        assertEquals(t9, Tuple9.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc"));
        assertEquals(t10, t10);
        assertEquals(t10, Tuple10.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertEquals(t11, t11);
        assertEquals(t11, Tuple11.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1)));
        assertEquals(t12, t12);
        assertEquals(t12, Tuple12.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1));
        assertEquals(t13, t13);
        assertEquals(t13, Tuple13.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertEquals(t14, t14);
        assertEquals(t14, Tuple14.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f));
        assertEquals(t15, t15);
        assertEquals(t15, Tuple15.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5));
        assertEquals(t16, t16);
        assertEquals(t16, Tuple16.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c'));
        assertEquals(t17, t17);
        assertEquals(t17, Tuple17.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
        assertEquals(t18, t18);
        assertEquals(t18, Tuple18.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc"));
        assertEquals(t19, t19);
        assertEquals(t19, Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1)));
        assertEquals(t20, t20);
        assertEquals(t20, Tuple20.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1)));
        assertEquals(t21, t21);
        assertEquals(t21, Tuple21.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1));
        assertEquals(t22, t22);
        assertEquals(t22, Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L));
        assertEquals(t23, t23);
        assertEquals(t23, Tuple23.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f));
        assertEquals(t24, t24);
        assertEquals(t24, Tuple24.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5));
        assertEquals(t25, t25);
        assertEquals(t25, Tuple25.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c'));
        assertEquals(t26, t26);
        assertEquals(t26, Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true));
    }

    @Test
    public void test_AllTuple_compare() {
        assertEquals(0, t0.compareTo(t0));
        assertEquals(0, t0.compareTo(Tuple0.of()));
        assertEquals(0, t1.compareTo(t1));
        assertEquals(0, t1.compareTo(Tuple1.of(((byte) 1))));
        assertEquals(0, t2.compareTo(t2));
        assertEquals(0, t2.compareTo(Tuple2.of(((byte) 1), ((short) 1))));
        assertEquals(0, t3.compareTo(t3));
        assertEquals(0, t3.compareTo(Tuple3.of(((byte) 1), ((short) 1), 1)));
        assertEquals(0, t4.compareTo(t4));
        assertEquals(0, t4.compareTo(Tuple4.of(((byte) 1), ((short) 1), 1, 1L)));
        assertEquals(0, t5.compareTo(t5));
        assertEquals(0, t5.compareTo(Tuple5.of(((byte) 1), ((short) 1), 1, 1L, 1.5f)));
        assertEquals(0, t6.compareTo(t6));
        assertEquals(0, t6.compareTo(Tuple6.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5)));
        assertEquals(0, t7.compareTo(t7));
        assertEquals(0, t7.compareTo(Tuple7.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c')));
        assertEquals(0, t8.compareTo(t8));
        assertEquals(0, t8.compareTo(Tuple8.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)));
        assertEquals(0, t9.compareTo(t9));
        assertEquals(0, t9.compareTo(Tuple9.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc")));
        assertEquals(0, t10.compareTo(t10));
        assertEquals(0, t10.compareTo(Tuple10.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))));
        assertEquals(0, t11.compareTo(t11));
        assertEquals(0, t11.compareTo(Tuple11.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1))));
        assertEquals(0, t12.compareTo(t12));
        assertEquals(0, t12.compareTo(Tuple12.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1)));
        assertEquals(0, t13.compareTo(t13));
        assertEquals(0, t13.compareTo(Tuple13.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)));
        assertEquals(0, t14.compareTo(t14));
        assertEquals(0, t14.compareTo(Tuple14.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f)));
        assertEquals(0, t15.compareTo(t15));
        assertEquals(0, t15.compareTo(Tuple15.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5)));
        assertEquals(0, t16.compareTo(t16));
        assertEquals(0, t16.compareTo(Tuple16.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c')));
        assertEquals(0, t17.compareTo(t17));
        assertEquals(0, t17.compareTo(Tuple17.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)));
        assertEquals(0, t18.compareTo(t18));
        assertEquals(0, t18.compareTo(Tuple18.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc")));
        assertEquals(0, t19.compareTo(t19));
        assertEquals(0, t19.compareTo(Tuple19.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1))));
        assertEquals(0, t20.compareTo(t20));
        assertEquals(0, t20.compareTo(Tuple20.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1))));
        assertEquals(0, t21.compareTo(t21));
        assertEquals(0, t21.compareTo(Tuple21.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1)));
        assertEquals(0, t22.compareTo(t22));
        assertEquals(0, t22.compareTo(Tuple22.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L)));
        assertEquals(0, t23.compareTo(t23));
        assertEquals(0, t23.compareTo(Tuple23.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f)));
        assertEquals(0, t24.compareTo(t24));
        assertEquals(0, t24.compareTo(Tuple24.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5)));
        assertEquals(0, t25.compareTo(t25));
        assertEquals(0, t25.compareTo(Tuple25.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c')));
        assertEquals(0, t26.compareTo(t26));
        assertEquals(0, t26.compareTo(Tuple26.of(((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true, "abc", ((byte) 1), ((short) 1), 1, 1L, 1.5f, 1.5, 'c', true)));
    }

}