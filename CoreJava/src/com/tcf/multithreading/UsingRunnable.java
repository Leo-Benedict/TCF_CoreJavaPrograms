package com.tcf.multithreading;

public class UsingRunnable implements Runnable {

    private int start, end;
    String msg;
    Thread t;

    public UsingRunnable(int start, int end, String msg) {
        this.start = start;   // 'this' differentiates instance variable from parameter
        this.end = end;
        this.msg = msg;

        this.t = new Thread(this, "child thread"); // 'this' refers to the current object
        t.start();
    }

    public void run() {
        for(int i = start; i <= end; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello " + msg);
        }
    }
}

