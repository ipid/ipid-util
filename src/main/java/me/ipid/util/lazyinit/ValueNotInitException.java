package me.ipid.util.lazyinit;

public final class ValueNotInitException extends RuntimeException {
    public ValueNotInitException(String message) {
        super(message);
    }
}
