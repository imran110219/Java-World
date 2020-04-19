package com.company.part9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class ReentrantLockExample {

    private ReentrantLock lock = new ReentrantLock(true);

    private int counter = 0;

    void perform() {

        lock.lock();
        System.out.println("Thread - " + Thread.currentThread().getName() + " acquired the lock");
        try {
            System.out.println("Thread - " + Thread.currentThread().getName() + " processing");
            counter++;
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("Thread - " + Thread.currentThread().getName() + " released the lock");
        }
    }

    private void performTryLock() {

        System.out.println("Thread - " + Thread.currentThread().getName() + " attempting to acquire the lock");
        try {
            boolean isLockAcquired = lock.tryLock(2, TimeUnit.SECONDS);
            if (isLockAcquired) {
                try {
                    System.out.println("Thread - " + Thread.currentThread().getName() + " acquired the lock");

                    System.out.println("Thread - " + Thread.currentThread().getName() + " processing");
                    sleep(1000);
                } finally {
                    lock.unlock();
                    System.out.println("Thread - " + Thread.currentThread().getName() + " released the lock");

                }
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Thread - " + Thread.currentThread().getName() + " could not acquire the lock");
    }

    public ReentrantLock getLock() {
        return lock;
    }

    boolean isLocked() {
        return lock.isLocked();
    }

    boolean hasQueuedThreads() {
        return lock.hasQueuedThreads();
    }

    int getCounter() {
        return counter;
    }

    public static void main(String[] args) {

        final int threadCount = 2;
        final ExecutorService service = Executors.newFixedThreadPool(threadCount);
        final ReentrantLockExample object = new ReentrantLockExample();

        service.execute(object::perform);
        service.execute(object::performTryLock);

        service.shutdown();

    }
}
