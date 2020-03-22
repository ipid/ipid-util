/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

public final class Tuple0
        extends Tupling
        implements Comparable<Tuple0> {

    private static final long serialVersionUID = 52072870355927041L;

    public static Tuple0 of() {
        return new Tuple0();
    }

    public Tuple0 add(Tuple0 tX) {
        nullCheckOfAdd(tX);
        return this;
    }

    public <E0> Tuple1<E0> add(Tuple1<E0> tX) {
        nullCheckOfAdd(tX);
        return tX;
    }

    public <E0, E1> Tuple2<E0, E1> add(Tuple2<E0, E1> tX) {
        nullCheckOfAdd(tX);
        return tX;
    }

    public <E0, E1, E2> Tuple3<E0, E1, E2> add(Tuple3<E0, E1, E2> tX) {
        nullCheckOfAdd(tX);
        return tX;
    }

    public <E0, E1, E2, E3> Tuple4<E0, E1, E2, E3> add(Tuple4<E0, E1, E2, E3> tX) {
        nullCheckOfAdd(tX);
        return tX;
    }

    public <E0, E1, E2, E3, E4> Tuple5<E0, E1, E2, E3, E4> add(Tuple5<E0, E1, E2, E3, E4> tX) {
        nullCheckOfAdd(tX);
        return tX;
    }

    public <E0, E1, E2, E3, E4, E5> Tuple6<E0, E1, E2, E3, E4, E5> add(Tuple6<E0, E1, E2, E3, E4, E5> tX) {
        nullCheckOfAdd(tX);
        return tX;
    }

    public <E0, E1, E2, E3, E4, E5, E6> Tuple7<E0, E1, E2, E3, E4, E5, E6> add(Tuple7<E0, E1, E2, E3, E4, E5, E6> tX) {
        nullCheckOfAdd(tX);
        return tX;
    }

    public <E0, E1, E2, E3, E4, E5, E6, E7> Tuple8<E0, E1, E2, E3, E4, E5, E6, E7> add(Tuple8<E0, E1, E2, E3, E4, E5, E6, E7> tX) {
        nullCheckOfAdd(tX);
        return tX;
    }

    protected Tuple0() {
        this.valueList = new Object[0];
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Tuple0;
    }

    /**
     * Returns 0.
     *
     * @param o Another Tuple0 instance
     * @return (int) 0
     */
    @Override
    public int compareTo(Tuple0 o) {
        if (o == null) {
            throw new NullPointerException("Comparing tupling to null");
        }
        return 0;
    }

    @Override
    public Tuple0 clone() {
        return new Tuple0();
    }

    @Override
    public int hashCode() {
        // Provide better implementation than in Tupling
        return 1;
    }
}