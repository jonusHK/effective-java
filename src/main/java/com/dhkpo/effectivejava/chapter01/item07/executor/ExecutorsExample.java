package com.dhkpo.effectivejava.chapter01.item07.executor;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        Thread thread = new Thread(new Task());
//        thread.start();

        int numberOfCpu = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(numberOfCpu);

        // Runnable
        for (int i = 0; i < 100; i++) {
            service.submit(new Task());
        }

        // Callable
        Future<String> submit = service.submit(new Task2());
        // blocking 코드
        System.out.println(submit.get());

        System.out.println(Thread.currentThread() + " hello");

        service.shutdown();
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread() + " world");
        }
    }

    static class Task2 implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + " world";
        }
    }
}
