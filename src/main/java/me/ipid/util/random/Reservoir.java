package me.ipid.util.random;

import java.util.*;

public final class Reservoir<T> {
    private int count;
    private Object[] reservoir;
    private Random randGen;

    public Reservoir(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size <= 0 is not allowed");
        }

        this.count = 0;
        this.reservoir = new Object[size];
        this.randGen = new Random();
    }

    public void feed(T elem) {
        if (elem == null) {
            throw new IllegalArgumentException("Null elements are not allowed.");
        }

        // 计数，但此时元素还未放入水库
        // count 表示“feed 函数被调用次数”
        count++;

        // 如果水库还没满，则直接存入就完了
        if (count <= reservoir.length) {
            reservoir[count - 1] = elem;
            return;
        }

        // Java 自带的模运算会产生负数，这个保证和 count 符号一致
        int randNum = Math.floorMod(randGen.nextInt(), count);
        if (randNum < reservoir.length) {
            reservoir[randNum] = elem;
        }
    }

    @SuppressWarnings("unchecked")
    public Optional<T> get(int index) {
        if (index < 0 || index >= reservoir.length) {
            return Optional.empty();
        }

        return Optional.ofNullable((T) reservoir[index]);
    }

    public int size() {
        return Math.min(count, reservoir.length);
    }

    @SuppressWarnings("unchecked")
    public List<T> getList() {
        ArrayList<T> result = new ArrayList<>();

        for (Object obj : reservoir) {
            if (obj != null) {
                result.add((T) obj);
            }
        }

        return result;
    }

    public void feedStream(Iterator<T> it) {
        while (it.hasNext()) {
            feed(it.next());
        }
    }

    public void feedStream(Iterable<T> iterable) {
        feedStream(iterable.iterator());
    }
}
