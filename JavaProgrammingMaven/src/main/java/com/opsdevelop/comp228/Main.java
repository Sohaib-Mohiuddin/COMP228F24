package com.opsdevelop.comp228;

import com.opsdevelop.comp228.week9.DatabaseManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
}
