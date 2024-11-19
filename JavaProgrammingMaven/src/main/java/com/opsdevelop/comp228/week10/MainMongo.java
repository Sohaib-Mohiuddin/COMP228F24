package com.opsdevelop.comp228.week10;

import java.util.List;


public class MainMongo {
    public static void main(String[] args) {
        // Connection details for MongoDB
        String connectionString = "mongodb+srv://admin:admin@cluster0.mc8vi.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";
        String dbName = "comp228";
        String collectionName = "comp228_demo";

        MongoDBManager manager = new MongoDBManager(connectionString, dbName, collectionName);

        // Add a user
        User user = new User("John", "Doe", 25, "Blue", "Computer Science");
        manager.addUser(user);

        // Read users
        List<User> users = manager.getAllUsers();
        users.forEach(u -> System.out.println("Found User: " + u));

        // Update user
        User updatedUser = new User("John", "Doe", 26, "Green", "Data Science");
        manager.updateUser("John", "Doe", updatedUser);

        // Delete user
//    manager.deleteUser("John", "Doe");

        // Close MongoDB connection
        manager.close();
    }
}
