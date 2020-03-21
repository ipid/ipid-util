package me.ipid.util.tupling;

import com.google.common.collect.Streams;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings({"ResultOfMethodCallIgnored", "UnstableApiUsage"})
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
    public void test_Tupling_getSize() {
        assertEquals(t0.getValueList().length, t0.getSize());
        assertEquals(t1.getValueList().length, t1.getSize());
        assertEquals(t2.getValueList().length, t2.getSize());
        assertEquals(t3.getValueList().length, t3.getSize());
        assertEquals(t4.getValueList().length, t4.getSize());
    }

    @Test
    public void test_Tupling_iterator() {
        Streams.mapWithIndex(Streams.stream(t4), (elem, index) -> {
            assertEquals(elem, t4.getValueList()[(int)index]);
            return null;
        });
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

    @Test
    public void test_Tuple1_instantiate() {
        Tuple1.of(0);
        assertThrows(NullPointerException.class, () -> Tuple1.of(null));
        // Test: skipping null check
        new Tuple1<Long>(null, null, false);
    }

    @Test
    public void test_Tuple1_get() {
        checkGetException(t1, 1);
        assertEquals(1, t1.a);
        assertEquals(1, t1.getA());
        assertEquals(1, t1.get(0));
    }

    @Test
    public void test_Tuple1_add() {
        assertEquals(t1.add(t0), t1);
        assertEquals(t1.add(Tuple1.of(true)), t2);
        assertEquals(t1.add(Tuple2.of(true, "abc")), t3);
        assertEquals(t1.add(Tuple3.of(true, "abc", 0x1FFFFFFFFL)), t4);

        assertThrows(NullPointerException.class, () -> t1.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple2<C, C>) null));
        assertThrows(NullPointerException.class, () -> t1.add((Tuple3<C, C, C>) null));
    }

    @Test
    public void test_Tuple1_equals() {
        assertEquals(t1, t1);
        assertEquals(t1, Tuple1.of(1));
        assertNotEquals(t1, Tuple1.of(0));
        assertNotEquals(t1, null);
        assertNotEquals(t1, "tuple");
    }

    @Test
    public void test_Tuple1_clone() {
        Tuple1<Integer> tClone = t1.clone();
        assertNotSame(t1, tClone);
        assertEquals(t1, tClone);
    }

    @Test
    public void test_Tuple1_compare() {
        assertTrue(t1.compareTo(Tuple1.of(0)) > 0);
        assertEquals(0, t1.compareTo(Tuple1.of(1)));
        assertTrue(t1.compareTo(Tuple1.of(2)) < 0);
        assertThrows(NullPointerException.class, () -> t1.compareTo(null));
    }

    @Test
    public void test_Tuple1_hashCode() {
        Tuple1<Integer> another = Tuple1.of(1);
        assertEquals(t1.hashCode(), another.hashCode());

        Tuple1<Integer> different1 = Tuple1.of(0);
        assertNotEquals(t1.hashCode(), different1.hashCode());
    }

    @Test
    public void test_Tuple2_instantiate() {
        Tuple2.of(1, true);
        assertThrows(NullPointerException.class, () -> Tuple2.of(null, true));
        assertThrows(NullPointerException.class, () -> Tuple2.of(1, null));
        // Test: skipping null check
        new Tuple2<Long, Long>(null, null, null, false);
    }

    @Test
    public void test_Tuple2_get() {
        checkGetException(t2, 2);
        assertEquals(1, t2.a);
        assertEquals(1, t2.getA());
        assertEquals(1, t2.get(0));
        assertEquals(true, t2.b);
        assertEquals(true, t2.getB());
        assertEquals(true, t2.get(1));
    }

    @Test
    public void test_Tuple2_add() {
        assertEquals(t2.add(t0), t2);
        assertEquals(t2.add(Tuple1.of("abc")), t3);
        assertEquals(t2.add(Tuple2.of("abc", 0x1FFFFFFFFL)), t4);

        assertThrows(NullPointerException.class, () -> t2.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple1<C>) null));
        assertThrows(NullPointerException.class, () -> t2.add((Tuple2<C, C>) null));
    }

    @Test
    public void test_Tuple2_equals() {
        assertEquals(t2, t2);
        assertEquals(t2, Tuple2.of(1, true));
        assertNotEquals(t2, Tuple2.of(0, true));
        assertNotEquals(t2, Tuple2.of(1, false));
        assertNotEquals(t2, null);
        assertNotEquals(t2, "tuple");
    }

    @Test
    public void test_Tuple2_clone() {
        Tuple2<Integer, Boolean> tClone = t2.clone();
        assertNotSame(t2, tClone);
        assertEquals(t2, tClone);
    }

    @Test
    public void test_Tuple2_compare() {
        assertTrue(t2.compareTo(Tuple2.of(0, true)) > 0);
        assertTrue(t2.compareTo(Tuple2.of(1, false)) > 0);
        assertEquals(0, t2.compareTo(Tuple2.of(1, true)));
        assertTrue(t2.compareTo(Tuple2.of(2, true)) < 0);
        assertThrows(NullPointerException.class, () -> t2.compareTo(null));
    }

    @Test
    public void test_Tuple2_hashCode() {
        Tuple2<Integer, Boolean> another = Tuple2.of(1, true);
        assertEquals(t2.hashCode(), another.hashCode());

        Tuple2<Integer, Boolean> different1 = Tuple2.of(0, true);
        assertNotEquals(t2.hashCode(), different1.hashCode());
        Tuple2<Integer, Boolean> different2 = Tuple2.of(1, false);
        assertNotEquals(t2.hashCode(), different2.hashCode());
    }

    @Test
    public void test_Tuple2_asMapEntry() {
        assertEquals(1, t2.getKey());
        assertEquals(true, t2.getValue());
        assertThrows(UnsupportedOperationException.class, () -> t2.setValue(false));
    }

    @Test
    public void test_Tuple3_instantiate() {
        Tuple3.of(1, true, "abc");
        assertThrows(NullPointerException.class, () -> Tuple3.of(null, true, "abc"));
        assertThrows(NullPointerException.class, () -> Tuple3.of(1, null, "abc"));
        assertThrows(NullPointerException.class, () -> Tuple3.of(1, true, null));
        // Test: skipping null check
        new Tuple3<Long, Long, Long>(null, null, null, null, false);
    }

    @Test
    public void test_Tuple3_get() {
        checkGetException(t3, 3);
        assertEquals(1, t3.a);
        assertEquals(1, t3.getA());
        assertEquals(1, t3.get(0));
        assertEquals(true, t3.b);
        assertEquals(true, t3.getB());
        assertEquals(true, t3.get(1));
        assertEquals("abc", t3.c);
        assertEquals("abc", t3.getC());
        assertEquals("abc", t3.get(2));
    }

    @Test
    public void test_Tuple3_add() {
        assertEquals(t3.add(t0), t3);
        assertEquals(t3.add(Tuple1.of(0x1FFFFFFFFL)), t4);

        assertThrows(NullPointerException.class, () -> t3.add((Tuple0) null));
        assertThrows(NullPointerException.class, () -> t3.add((Tuple1<C>) null));
    }

    @Test
    public void test_Tuple3_equals() {
        assertEquals(t3, t3);
        assertEquals(t3, Tuple3.of(1, true, "abc"));
        assertNotEquals(t3, Tuple3.of(0, true, "abc"));
        assertNotEquals(t3, Tuple3.of(1, false, "abc"));
        assertNotEquals(t3, Tuple3.of(1, true, "ab"));
        assertNotEquals(t3, null);
        assertNotEquals(t3, "tuple");
    }

    @Test
    public void test_Tuple3_clone() {
        Tuple3<Integer, Boolean, String> tClone = t3.clone();
        assertNotSame(t3, tClone);
        assertEquals(t3, tClone);
    }

    @Test
    public void test_Tuple3_compare() {
        assertTrue(t3.compareTo(Tuple3.of(0, true, "abc")) > 0);
        assertTrue(t3.compareTo(Tuple3.of(1, false, "abc")) > 0);
        assertTrue(t3.compareTo(Tuple3.of(1, true, "ab")) > 0);
        assertEquals(0, t3.compareTo(Tuple3.of(1, true, "abc")));
        assertTrue(t3.compareTo(Tuple3.of(2, true, "abc")) < 0);
        assertTrue(t3.compareTo(Tuple3.of(1, true, "abcd")) < 0);
        assertThrows(NullPointerException.class, () -> t3.compareTo(null));
    }

    @Test
    public void test_Tuple3_hashCode() {
        Tuple3<Integer, Boolean, String> another = Tuple3.of(1, true, "abc");
        assertEquals(t3.hashCode(), another.hashCode());

        Tuple3<Integer, Boolean, String> different1 = Tuple3.of(0, true, "abc");
        assertNotEquals(t3.hashCode(), different1.hashCode());
        Tuple3<Integer, Boolean, String> different2 = Tuple3.of(1, false, "abc");
        assertNotEquals(t3.hashCode(), different2.hashCode());
        Tuple3<Integer, Boolean, String> different3 = Tuple3.of(1, true, "abcd");
        assertNotEquals(t3.hashCode(), different3.hashCode());
    }

    @Test
    public void test_Tuple4_instantiate() {
        Tuple4.of(1, true, "abc", 0x1FFFFFFFFL);
        assertThrows(NullPointerException.class, () -> Tuple4.of(null, true, "abc", 0x1FFFFFFFFL));
        assertThrows(NullPointerException.class, () -> Tuple4.of(1, null, "abc", 0x1FFFFFFFFL));
        assertThrows(NullPointerException.class, () -> Tuple4.of(1, true, null, 0x1FFFFFFFFL));
        assertThrows(NullPointerException.class, () -> Tuple4.of(1, true, "abc", null));
        // Test: skipping null check
        new Tuple4<C, C, C, C>(null, null, null, null, null, false);
    }

    @Test
    public void test_Tuple4_get() {
        checkGetException(t4, 4);
        assertEquals(1, t4.a);
        assertEquals(1, t4.getA());
        assertEquals(1, t4.get(0));
        assertEquals(true, t4.b);
        assertEquals(true, t4.getB());
        assertEquals(true, t4.get(1));
        assertEquals("abc", t4.c);
        assertEquals("abc", t4.getC());
        assertEquals("abc", t4.get(2));
        assertEquals(0x1FFFFFFFFL, t4.d);
        assertEquals(0x1FFFFFFFFL, t4.getD());
        assertEquals(0x1FFFFFFFFL, t4.get(3));
    }

    @Test
    public void test_Tuple4_add() {
        assertEquals(t4.add(t0), t4);
        assertThrows(NullPointerException.class, () -> t4.add(null));
    }

    @Test
    public void test_Tuple4_equals() {
        assertEquals(t4, t4);
        assertEquals(t4, Tuple4.of(1, true, "abc", 0x1FFFFFFFFL));
        assertNotEquals(t4, Tuple4.of(0, true, "abc", 0x1FFFFFFFFL));
        assertNotEquals(t4, Tuple4.of(1, false, "abc", 0x1FFFFFFFFL));
        assertNotEquals(t4, Tuple4.of(1, true, "ab", 0x1FFFFFFFFL));
        assertNotEquals(t4, Tuple4.of(1, true, "abc", 0x1FFFFFFFEL));
        assertNotEquals(t4, null);
        assertNotEquals(t4, "tuple");
    }

    @Test
    public void test_Tuple4_clone() {
        Tuple4<Integer, Boolean, String, Long> tClone = t4.clone();
        assertNotSame(t4, tClone);
        assertEquals(t4, tClone);
    }

    @Test
    public void test_Tuple4_compare() {
        assertTrue(t4.compareTo(Tuple4.of(0, true, "abc", 0x1FFFFFFFFL)) > 0);
        assertTrue(t4.compareTo(Tuple4.of(1, false, "abc", 0x1FFFFFFFFL)) > 0);
        assertTrue(t4.compareTo(Tuple4.of(1, true, "ab", 0x1FFFFFFFFL)) > 0);
        assertTrue(t4.compareTo(Tuple4.of(1, true, "abc", 0x1FFFFFFFEL)) > 0);
        assertEquals(0, t4.compareTo(Tuple4.of(1, true, "abc", 0x1FFFFFFFFL)));
        assertTrue(t4.compareTo(Tuple4.of(2, true, "abc", 0x1FFFFFFFFL)) < 0);
        assertTrue(t4.compareTo(Tuple4.of(1, true, "abcd", 0x1FFFFFFFFL)) < 0);
        assertTrue(t4.compareTo(Tuple4.of(1, true, "abc", 0x2FFFFFFFFL)) < 0);
        assertThrows(NullPointerException.class, () -> t4.compareTo(null));
    }

    @Test
    public void test_Tuple4_hashCode() {
        Tuple4<Integer, Boolean, String, Long> another = Tuple4.of(1, true, "abc", 0x1FFFFFFFFL);
        assertEquals(t4.hashCode(), another.hashCode());

        Tuple4<Integer, Boolean, String, Long> different1 = Tuple4.of(0, true, "abc", 0x1FFFFFFFFL);
        assertNotEquals(t4.hashCode(), different1.hashCode());
        Tuple4<Integer, Boolean, String, Long> different2 = Tuple4.of(1, false, "abc", 0x1FFFFFFFFL);
        assertNotEquals(t4.hashCode(), different2.hashCode());
        Tuple4<Integer, Boolean, String, Long> different3 = Tuple4.of(1, true, "abcd", 0x1FFFFFFFFL);
        assertNotEquals(t4.hashCode(), different3.hashCode());
        Tuple4<Integer, Boolean, String, Long> different4 = Tuple4.of(1, true, "abc", 0x1FFFFFFFEL);
        assertNotEquals(t4.hashCode(), different4.hashCode());
    }


}
