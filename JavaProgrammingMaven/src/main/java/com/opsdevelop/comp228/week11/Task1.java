package com.opsdevelop.comp228.week11;

public class Task1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task1 - Count: " + i);
            try {
                Thread.sleep(500); // Simulate a delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Task1 Completed!");
    }
}
