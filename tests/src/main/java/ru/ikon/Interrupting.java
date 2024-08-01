package ru.ikon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class SleepBlocking implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("After interrupted catch");

    }
}

public class Interrupting {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        Future<?> f = exec.submit(new SleepBlocking());
        TimeUnit.SECONDS.sleep(100);
        System.out.println("Interrupting " + SleepBlocking.class);
        f.cancel(true);
        System.out.println("After Cancelling");
    }
}