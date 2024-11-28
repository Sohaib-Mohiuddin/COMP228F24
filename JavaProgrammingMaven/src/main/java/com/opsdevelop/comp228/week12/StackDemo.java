package com.opsdevelop.comp228.week12;

import java.util.Stack;

public class StackDemo {
    public void demonstrateStack() {
        Stack<String> stack = new Stack<String>();

        // Pushing elements
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Popping an element
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}

