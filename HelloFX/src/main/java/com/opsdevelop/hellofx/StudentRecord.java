package com.opsdevelop.hellofx;

public class StudentRecord {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String favoriteColor;
    private final String collegeProgram;

    public StudentRecord(String firstName, String lastName, int age, String favoriteColor, String collegeProgram) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.collegeProgram = collegeProgram;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getCollegeProgram() {
        return collegeProgram;
    }
}