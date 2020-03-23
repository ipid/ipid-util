package me.ipid.util.visitor;


public interface VisitHandler<TMatch> {
    void handle(TMatch obj);
}