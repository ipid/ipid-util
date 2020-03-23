package me.ipid.util.visitor;

public class VisitorBuilder<T> {
    private T elem;
    private boolean matched;

    VisitorBuilder(T elem) {
        this.elem = elem;
        this.matched = false;
    }

    @SuppressWarnings("unchecked")
    public <TMatch extends T> VisitorBuilder<T> when(Class<TMatch> cls, VisitHandler<TMatch> handler) {
        if (matched) {
            return this;
        }

        if (cls.isInstance(elem)) {
            handler.handle((TMatch) elem);
            matched = true;
        }
        return this;
    }

    public void other(VisitHandler<T> handler) {
        if (matched) {
            return;
        }
        handler.handle(elem);
    }
}
