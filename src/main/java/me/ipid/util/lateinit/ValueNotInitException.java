package me.ipid.util.lateinit;

public final class ValueNotInitException extends RuntimeException {
    public ValueNotInitException(String message) {
        super(message);
    }
}
