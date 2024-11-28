package com.opsdevelop.comp228.week12;

import java.util.HashMap;

public class HashMapDemo {
    public void demonstrateHashMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        // Displaying the HashMap
        System.out.println("HashMap: " + hashMap);

        // Accessing a value
        System.out.println("Alice's age: " + hashMap.get("Alice"));

        // Removing an entry
        hashMap.remove("Bob");
        System.out.println("HashMap after removal: " + hashMap);
    }
}

