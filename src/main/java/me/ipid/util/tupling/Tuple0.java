/* GENERATED CODE. DO NOT MODIFY */
package me.ipid.util.tupling;

public final class Tuple0
        extends Tupling
        implements Comparable<Tuple0> {

    private static final long serialVersionUID = 52072870355927041L;

    public static Tuple0 of() {
        return new Tuple0();
    }

    public Tuple0 add(Tuple0 t) {
        nullCheckOfAdd(t);
        return this;
    }

    public <E0> Tuple1<E0> add(Tuple1<E0> t) {
        nullCheckOfAdd(t);
        return t;
    }

    public <E0, E1> Tuple2<E0, E1> add(Tuple2<E0, E1> t) {
        nullCheckOfAdd(t);
        return t;
    }

    public <E0, E1, E2> Tuple3<E0, E1, E2> add(Tuple3<E0, E1, E2> t) {
        nullCheckOfAdd(t);
        return t;
    }

    public <E0, E1, E2, E3> Tuple4<E0, E1, E2, E3> add(Tuple4<E0, E1, E2, E3> t) {
        nullCheckOfAdd(t);
        return t;
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