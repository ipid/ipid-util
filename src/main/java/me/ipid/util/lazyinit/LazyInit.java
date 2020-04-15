package me.ipid.util.lazyinit;

public final class LazyInit<T> {
    private T value;

    public LazyInit() {
        value = null;
    }

    public T get() {
        if (value == null) {
            throw new ValueNotInitException("You try to get a lazy-init value, but it wasn't initialized yet");
        }

        return value;
    }

    public void set(T newValue) {
        if (value != null) {
            throw new ValueNotInitException("You try to set value on an initialized lazy-init value, but that is not allowed. Lazy-init values are immutable.");
        }
        if (newValue == null) {
            throw new NullPointerException("You try to assign `null` to a lazy-init value. Lazy-init values can't be null.");
        }

        value = newValue;
    }
}
