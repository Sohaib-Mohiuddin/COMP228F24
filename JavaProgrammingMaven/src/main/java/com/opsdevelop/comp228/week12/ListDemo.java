package com.opsdevelop.comp228.week12;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public void demonstrateList() {
        List<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Iterating through the list
        System.out.println("List contents:");
        for (Integer num : list) {
            System.out.println(num);
        }

        // Checking if a value exists
        System.out.println("List contains 20: " + list.contains(20));
    }
}

