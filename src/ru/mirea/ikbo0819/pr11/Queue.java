package ru.mirea.ikbo0819.pr11;

public interface Queue {
    boolean enqueue  (int n);
    int element();
    int dequeue ();
    int size();
    boolean isEmpty ();
    void clear  ();
}