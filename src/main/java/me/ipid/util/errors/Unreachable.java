package me.ipid.util.errors;

public class Unreachable extends Error {
    public Unreachable() {
        super("The program should not reach here.");
    }
}
