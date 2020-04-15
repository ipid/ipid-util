package me.ipid.util.nonnulls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Stream;

public class NonNullArrayList<T> extends ArrayList<T> {

    // TODO: Benchmark and get a better threshold
    private static final int PARALLEL_THRESHOLD = 128;

    public NonNullArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public NonNullArrayList() {
    }

    public NonNullArrayList(Collection<? extends T> c) {
        super(c);
        checkContainer(c);
    }

    private static void checkContainer(Collection<?> c) {
        Stream<?> stream;

        // If c has too many elements, use parallelStream
        if (c.size() > PARALLEL_THRESHOLD) {
            stream = c.parallelStream();
        } else {
            stream = c.stream();
        }

        if (!stream.allMatch(Objects::nonNull)) {
            throw new NullPointerException();
        }
    }

    @Override
    public boolean add(T t) {
        return super.add(Objects.requireNonNull(t));
    }

    @Override
    public void add(int index, T element) {
        super.add(index, Objects.requireNonNull(element));
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        checkContainer(c);
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        checkContainer(c);
        return super.addAll(index, c);
    }
}
