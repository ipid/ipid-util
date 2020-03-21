package me.ipid.util.tupling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {

    private static class C {
    }

    private static final int ELEMENT_NUM_MAX = 4;

    private Tuple0 t0;
    private Tuple1<Integer> t1;
    private Tuple2<Integer, Boolean> t2;
    private Tuple3<Integer, Boolean, String> t3;
    private Tuple4<Integer, Boolean, String, Long> t4;

    @BeforeEach
    public void initializeTuples() {
        t0 = Tuple0.of();
        t1 = Tuple1.of(1);
        t2 = Tuple2.of(1, true);
        t3 = Tuple3.of(1, true, "abc");
        t4 = Tuple4.of(1, true, "abc", 0x1FFFFFFFFL);
    }

    @Test
    public void test_elements() {
        assertArrayEquals(new Object[]{}, t0.getValueList());
        assertArrayEquals(new Object[]{1}, t1.getValueList());
        assertArrayEquals(new Object[]{1, true}, t2.getValueList());
        assertArrayEquals(new Object[]{1, true, "abc"}, t3.getValueList());
        assertArrayEquals(new Object[]{1, true, "abc", 0x1FFFFFFFFL}, t4.getValueList());
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
    public void test_Tuple0_get() {
        checkGetException(t0, 0);
    }

    @Test
    public void test_Tuple0_add() {
        assertEquals(t0.add(t0), t0);
        assertEquals(t0.add(t1), t1);
        assertEquals(t0.add(t2), t2);
        assertEquals(t0.add(t3), t3);
        assertEquals(t0.add(t4), t4);

        assertThrows(NullPointerException.class, () -> t0.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t0.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t0.add((Tuple2<C, C>) null));
        assertThrows(NullPointerException.class, () -> t0.add((Tuple3<C, C, C>) null));
        assertThrows(NullPointerException.class, () -> t0.add((Tuple4<C, C, C, C>) null));
    }

    @Test
    public void test_Tuple0_equals() {
        assertEquals(t0, t0);
        assertEquals(t0, Tuple0.of());
        assertNotEquals(t0, null);
        assertNotEquals(t0, "tuple");
    }

    @Test
    public void test_Tuple0_clone() {
        Tuple0 tClone = t0.clone();
        assertNotSame(t0, tClone);
        assertEquals(t0, tClone);
    }

    @Test
    public void test_Tuple0_compare() {
        assertEquals(t0.compareTo(Tuple0.of()), 0);
        assertThrows(NullPointerException.class, () -> t0.compareTo(null));
    }

    @Test
    public void test_Tuple0_hashCode() {
        Tuple0 anotherT0 = Tuple0.of();
        assertEquals(t0.hashCode(), anotherT0.hashCode());
    }
}
