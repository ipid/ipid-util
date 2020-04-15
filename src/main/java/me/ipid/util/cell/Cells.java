package me.ipid.util.cell;

public final class Cells {
    private Cells() {
    }

    public static <E> Cell<E> of(E elem) {
        return new Cell<>(elem);
    }

    public static <E> Cell<E> empty() {
        return new Cell<>(null);
    }

    public static CellByte emptyByte() {
        return new CellByte((byte) 0);
    }

    public static CellShort emptyShort() {
        return new CellShort((short) 0);
    }

    public static CellInt emptyInt() {
        return new CellInt(0);
    }

    public static CellLong emptyLong() {
        return new CellLong(0L);
    }

    public static CellFloat emptyFloat() {
        return new CellFloat(0f);
    }

    public static CellDouble emptyDouble() {
        return new CellDouble(0d);
    }

    public static CellChar emptyChar() {
        return new CellChar('\u0000');
    }

    public static CellBool emptyBool() {
        return new CellBool(false);
    }

    public static CellByte of(byte elem) {
        return new CellByte(elem);
    }

    public static CellShort of(short elem) {
        return new CellShort(elem);
    }

    public static CellInt of(int elem) {
        return new CellInt(elem);
    }

    public static CellLong of(long elem) {
        return new CellLong(elem);
    }

    public static CellFloat of(float elem) {
        return new CellFloat(elem);
    }

    public static CellDouble of(double elem) {
        return new CellDouble(elem);
    }

    public static CellChar of(char elem) {
        return new CellChar(elem);
    }

    public static CellBool of(boolean elem) {
        return new CellBool(elem);
    }
}
