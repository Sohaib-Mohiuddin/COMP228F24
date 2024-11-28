package com.opsdevelop.comp228.week12;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public void demonstrateQueue() {
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Displaying the queue
        System.out.println("Queue: " + queue);

        // Removing elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Peeking at the next element
        System.out.println("Next element: " + queue.peek());
    }
}
