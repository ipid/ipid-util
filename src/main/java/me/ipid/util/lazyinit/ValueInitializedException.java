package me.ipid.util.lazyinit;

public final class ValueInitializedException extends RuntimeException {
    public ValueInitializedException(String message) {
        super(message);
    }
}
