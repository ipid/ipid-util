package me.ipid.util.cell;

public class Cells {
    private Cells() {
    }

    public static <E> Cell<E> of(E elem) {
        return new Cell<>(elem);
    }

    public static <E> Cell<E> empty() {
        return new Cell<>(null);
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
