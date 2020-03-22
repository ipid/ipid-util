package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"UnstableApiUsage"})
class TestTupleAll {

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
    }

    @Test
    public void test_Tupling_iterator() {
        Streams.mapWithIndex(Streams.stream(t8), (elem, index) -> {
            assertEquals(elem, t8.getValueList()[(int)index]);
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
    }

}