package ru.tadzh.arrayList;

public class Main {
    public static void main(String[] args) {
     ArrayList<Integer> arrayList = new ArrayListImpl<>(10);
     arrayList.add(1);
     arrayList.add(2);
     arrayList.add(3);
     arrayList.add(4);
     arrayList.add(5);
     arrayList.display();
     System.out.println(arrayList.contains(3));
     System.out.println(arrayList.get(1));
     System.out.println(arrayList.indexOf(5));
     System.out.println(arrayList.isEmpty());
     System.out.println(arrayList.size());
     System.out.println(arrayList.remove(3));
     System.out.println(arrayList.remove(Integer.valueOf(3)));
     arrayList.display();
    }
}
