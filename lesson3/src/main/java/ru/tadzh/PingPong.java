package ru.tadzh;

public class PingPong {

    private String data;

    public PingPong(String data) {
        this.data = data;
    }

    public synchronized void ping() {
        while (this.data.equals("pong") || Thread.interrupted()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(data);
        this.data = "pong";
        this.notifyAll();
    }

    public synchronized void pong() {
        while (this.data.equals("ping") || Thread.interrupted()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(data);
        this.data = "ping";
        this.notifyAll();
    }

    public static void main(String[] args) throws InterruptedException {
        PingPong pingPong = new PingPong("ping");

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                pingPong.ping();
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            pingPong.pong();
        }
    }
}