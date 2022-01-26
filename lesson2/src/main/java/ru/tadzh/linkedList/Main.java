package ru.tadzh.linkedList;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedListImpl <>();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        System.out.println(list.getFirst());
        System.out.println(list.contains(3));
        System.out.println(list.size());
        System.out.println(list.removeFirst());
        System.out.println(list.remove(2));
        list.display();
    }
}
