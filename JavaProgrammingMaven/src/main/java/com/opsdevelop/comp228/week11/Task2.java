package com.opsdevelop.comp228.week11;

public class Task2 implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Task2 - Character: " + c);
            try {
                Thread.sleep(700); // Simulate a delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Task2 Completed!");
    }
}
