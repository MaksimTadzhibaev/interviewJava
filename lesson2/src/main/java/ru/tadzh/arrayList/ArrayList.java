package ru.tadzh.arrayList;

public interface ArrayList<E> {

    void add(E value);

    E get(int index);

    boolean remove(E value);

    E remove(int index);

    int indexOf(E value);

    boolean contains(E value);

    int size();

    boolean isEmpty();

    void display();
}