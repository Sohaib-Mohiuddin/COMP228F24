package com.opsdevelop.comp228;

import com.opsdevelop.comp228.week11.Task1;
import com.opsdevelop.comp228.week11.Task2;
import com.opsdevelop.comp228.week9.DatabaseManager;
import com.opsdevelop.comp228.week12.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // week10();
        // week11();
        // week12();
    }

    public static void week10() {
        DatabaseManager dbManager = new DatabaseManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Data");
            System.out.println("2. Read Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter first name:");
                    String firstName = scanner.next();
                    System.out.println("Enter last name:");
                    String lastName = scanner.next();
                    System.out.println("Enter age:");
                    int age = scanner.nextInt();
                    System.out.println("Enter favorite color:");
                    String favoriteColor = scanner.next();
                    System.out.println("Enter college program:");
                    String collegeProgram = scanner.next();
                    dbManager.addData(firstName, lastName, age, favoriteColor, collegeProgram);
                    break;

                case 2:
                    dbManager.readData();
                    break;

                case 3:
                    System.out.println("Enter the ID of the record to update:");
                    int updateId = scanner.nextInt();
                    System.out.println("Enter the new favorite color:");
                    String newColor = scanner.next();
                    dbManager.updateData(updateId, newColor);
                    break;

                case 4:
                    System.out.println("Enter the ID of the record to delete:");
                    int deleteId = scanner.nextInt();
                    dbManager.deleteData(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void week11() {
        System.out.println("Multithreading Example Started!");

        // Create and start threads
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to complete
            thread2.join(); // Wait for thread2 to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Multithreading Example Completed!");
    }

    public static void week12() {
        ArrayListDemo ald = new ArrayListDemo();
        ListDemo ld = new ListDemo();
        StackDemo sd = new StackDemo();
        QueueDemo qd = new QueueDemo();
        PriorityQueueDemo pqd = new PriorityQueueDemo();
        HashMapDemo hmd = new HashMapDemo();
        HashTableDemo htd = new HashTableDemo();

        // ald.demonstrateArrayList();
        // ld.demonstrateList();
        // sd.demonstrateStack();
        // qd.demonstrateQueue();
        // pqd.demonstratePriorityQueue();
        // hmd.demonstrateHashMap();
        // htd.demonstrateHashTable();
    }
}
