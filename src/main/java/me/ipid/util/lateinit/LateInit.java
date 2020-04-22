package me.ipid.util.lateinit;

public final class LateInit<T> {
    private T value;

    public LateInit() {
        value = null;
    }

    public T get() {
        if (value == null) {
            throw new ValueNotInitException("You try to get a late-init value, but it wasn't initialized yet");
        }

        return value;
    }

    public void set(T newValue) {
        if (value != null) {
            throw new ValueNotInitException("You try to set value on an initialized late-init value, but that is not allowed. late-init values are immutable.");
        }
        if (newValue == null) {
            throw new NullPointerException("You try to assign `null` to a late-init value. late-init values can't be null.");
        }

        value = newValue;
    }

    public boolean initialized() {
        return value != null;
    }
}
