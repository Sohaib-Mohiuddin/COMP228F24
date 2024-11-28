package com.opsdevelop.comp228.week12;

import java.util.Hashtable;

public class HashTableDemo {
    public void demonstrateHashTable() {
        Hashtable<String, String> hashTable = new Hashtable<>();

        // Adding key-value pairs
        hashTable.put("USA", "Washington DC");
        hashTable.put("UK", "London");
        hashTable.put("India", "New Delhi");

        // Displaying the Hashtable
        System.out.println("Hashtable: " + hashTable);

        // Accessing a value
        System.out.println("Capital of India: " + hashTable.get("India"));

        // Removing an entry
        hashTable.remove("UK");
        System.out.println("Hashtable after removal: " + hashTable);
    }
}
