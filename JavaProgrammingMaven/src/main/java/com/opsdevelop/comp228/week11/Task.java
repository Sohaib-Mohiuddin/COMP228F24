package com.opsdevelop.comp228.week11;

import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;

public class Task implements Runnable
{
    private String name;

    public Task(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void run()
    {
        try {
            long startTime = System.currentTimeMillis();
            // LocalDateTime now = LocalDateTime.now();

            Long duration = (long) (Math.random() * 10);
            System.out.println("Executing : " + name);
            TimeUnit.SECONDS.sleep(duration);

            // LocalDateTime then = LocalDateTime.now();
            long endTime = System.currentTimeMillis();

            // System.out.println("Start Time: " + now + "End Time: " + then);
            System.out.println("Total Execution Time for " + name + ": " + (endTime - startTime) + " ms");
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}