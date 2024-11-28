package com.opsdevelop.comp228.week12;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public void demonstratePriorityQueue() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        // Adding elements
        priorityQueue.add(50);
        priorityQueue.add(20);
        priorityQueue.add(70);
        priorityQueue.add(10);

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Removing elements (smallest first)
        System.out.println("Polled: " + priorityQueue.poll());
        System.out.println("PriorityQueue after poll: " + priorityQueue);
    }
}


