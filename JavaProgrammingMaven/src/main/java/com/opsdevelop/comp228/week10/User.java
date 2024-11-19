package com.opsdevelop.comp228.week10;

import org.bson.Document;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String favoriteColor;
    private String collegeProgram;

    public User(String firstName, String lastName, int age, String favoriteColor, String collegeProgram) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.collegeProgram = collegeProgram;
    }

    public Document toDocument() {
        return new Document("firstName", firstName)
                .append("lastName", lastName)
                .append("age", age)
                .append("favoriteColor", favoriteColor)
                .append("collegeProgram", collegeProgram);
    }

    public static User fromDocument(Document doc) {
        return new User(
                doc.getString("firstName"),
                doc.getString("lastName"),
                doc.getInteger("age"),
                doc.getString("favoriteColor"),
                doc.getString("collegeProgram")
        );
    }
}