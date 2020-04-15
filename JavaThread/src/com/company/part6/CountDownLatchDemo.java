package com.company.part6;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    private static final CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(5);
    public static void main(String[] args) {
        Thread run1 = new Thread(() -> {
            System.out.println("Doing some work..");
            try {
                Thread.sleep(2000);
                COUNT_DOWN_LATCH.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread run2 = new Thread(() -> {
            System.out.println("Doing some work..");
            try {
                Thread.sleep(2000);
                COUNT_DOWN_LATCH.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread run3 = new Thread(() -> {
            System.out.println("Doing some work..");
            try {
                Thread.sleep(2000);
                COUNT_DOWN_LATCH.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread run4 = new Thread(() -> {
            System.out.println("Doing some work..");
            try {
                Thread.sleep(2000);
                COUNT_DOWN_LATCH.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread run5 = new Thread(() -> {
            System.out.println("Doing some work..");
            try {
                Thread.sleep(3000);
                COUNT_DOWN_LATCH.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        run1.start();
        run2.start();
        run3.start();
        run4.start();
        run5.start();
        try {
            COUNT_DOWN_LATCH.await();
        } catch (InterruptedException e) {
            //Handle when a thread gets interrupted.
        }
        System.out.println("All tasks have finished..");
    }
}
