package me.ipid.util.visitor;

public final class SubclassVisitor {
    private SubclassVisitor() {
    }

    public static <T> VisitorBuilder<T> visit(T obj) {
        return new VisitorBuilder<>(obj);
    }
}
