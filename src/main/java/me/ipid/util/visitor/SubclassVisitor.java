package me.ipid.util.visitor;

public class SubclassVisitor {
    private SubclassVisitor() {
    }

    public static <T> VisitorBuilder<T> visit(T obj) {
        return new VisitorBuilder<>(obj);
    }
}
