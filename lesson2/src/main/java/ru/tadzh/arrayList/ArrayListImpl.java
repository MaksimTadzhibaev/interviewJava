package ru.tadzh.arrayList;

import java.util.Arrays;

public class ArrayListImpl <E> implements ArrayList<E>{

    private static final int DEFAULT_CAPACITY = 8;

    private E[] data;
    private int size;

    public ArrayListImpl(int initialCapacity) {
        this.data = (E[]) new Object[initialCapacity];
    }

    public ArrayListImpl() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void add(E value) {
        if (data.length == size) {
            data = Arrays.copyOf(data, calculateNewLength());
        }
        data[size++] = value;
    }

    private int calculateNewLength() {
        return size == 0 ? 1 : size * 2;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            String errorMsg = String.format("Некорректный индекс 'index': %d; максимальное значение индекса - %d",
                    index, size - 1);
            throw new IndexOutOfBoundsException(errorMsg);
        }
        return data[index];
    }

    @Override
    public boolean remove(E value) {
        int index = indexOf(value);
        return index != -1 && remove(index) != null;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            String errorMsg = String.format("Некорректный индекс 'index': %d; максимальное значение индекса - %d",
                    index, size - 1);
            throw new IndexOutOfBoundsException(errorMsg);
        }
        E removedValue = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
        return removedValue;
    }

    @Override
    public int indexOf(E value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(E value) {
        return indexOf(value) != -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size -1; i++) {
            sb.append(data[i]);
            sb.append(", ");
        }
        if (size > 0) {
            sb.append(data[size - 1]);
        }
        sb.append("]");
        return sb.toString();
    }
}