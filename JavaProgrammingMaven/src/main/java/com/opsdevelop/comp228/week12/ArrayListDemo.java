package com.opsdevelop.comp228.week12;

import java.util.ArrayList;

public class ArrayListDemo {
    public void demonstrateArrayList() {
        ArrayList<String> arrayList = new ArrayList<String>();

        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Displaying elements
        System.out.println("ArrayList: " + arrayList);

        // Accessing elements
        System.out.println("First element: " + arrayList.get(0));

        // Removing an element
        arrayList.remove("Banana");
        System.out.println("After removing Banana: " + arrayList);
    }
}
