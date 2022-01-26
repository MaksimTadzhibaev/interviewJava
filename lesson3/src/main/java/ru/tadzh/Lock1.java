package ru.tadzh;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock1 {
    public static void main(String[] args) throws InterruptedException {
        InnerClass innerClass = new InnerClass(0);

        new Thread(() -> {
            System.out.println("start Thread1");
            for (int i = 0; i < 1000; i++) {
                innerClass.incCount();
            }
            System.out.println("stop Thread1");
        }).start();

        new Thread(() -> {
            System.out.println("start Thread2");
            for (int i = 0; i < 1000; i++) {
                innerClass.decCount();
            }
            System.out.println("stop Thread2");
        }).start();


        Thread.sleep(1000);
        System.out.println(innerClass.getCount());

    }

    static class InnerClass {

        private int count;

        private Lock lock = new ReentrantLock();

        public InnerClass(int count) {
            this.count = count;
        }

        void incCount() {
            lock.lock();
            try {
                count++;
            } finally {
                lock.unlock();
            }
        }

        void decCount() {
            lock.lock();
            try {
                count--;
            } finally {
                lock.unlock();
            }
        }

        public int getCount() {
            return count;
        }
    }
}
