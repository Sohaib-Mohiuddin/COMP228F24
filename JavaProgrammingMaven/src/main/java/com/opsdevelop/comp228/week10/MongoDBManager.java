package com.opsdevelop.comp228.week10;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoDBManager {
    private final MongoClient mongoClient;
    private final MongoDatabase database;
    private final MongoCollection<Document> collection;

    public MongoDBManager(String connectionString, String dbName, String collectionName) {
        mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase(dbName);
        collection = database.getCollection(collectionName);
    }

    public void addUser(User user) {
        collection.insertOne(user.toDocument());
        System.out.println("User added: " + user);
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for (Document doc : collection.find()) {
            users.add(User.fromDocument(doc));
        }
        return users;
    }

    public void updateUser(String firstName, String lastName, User updatedUser) {
        Document updatedDoc = updatedUser.toDocument();
        collection.replaceOne(
                Filters.and(
                        Filters.eq("firstName", firstName),
                        Filters.eq("lastName", lastName)),
                updatedDoc);
        System.out.println("User updated: " + updatedUser);
    }

    public void deleteUser(String firstName, String lastName) {
        collection.deleteOne(
                Filters.and(
                        Filters.eq("firstName", firstName),
                        Filters.eq("lastName", lastName)));
        System.out.println("User deleted: " + firstName + " " + lastName);
    }

    public void close() {
        mongoClient.close();
    }
}
