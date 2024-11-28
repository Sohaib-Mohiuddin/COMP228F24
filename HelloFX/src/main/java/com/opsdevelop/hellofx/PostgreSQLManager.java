package com.opsdevelop.hellofx;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class PostgreSQLManager {
    private final String url;
    private final String user;
    private final String password;

    public PostgreSQLManager(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public void addRecord(String firstName, String lastName, int age, String favoriteColor, String collegeProgram) {
        String query = "INSERT INTO comp228_demo (first_name, last_name, age, favorite_color, college_program) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setInt(3, age);
            stmt.setString(4, favoriteColor);
            stmt.setString(5, collegeProgram);
            stmt.executeUpdate();
            System.out.println("Record added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<StudentRecord> getAllRecords() {
        String query = "SELECT * FROM comp228_demo";
        List<StudentRecord> records = new ArrayList<>();
        try (Connection conn = connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                records.add(new StudentRecord(rs.getString("first_name"), rs.getString("last_name"), rs.getInt("age"), rs.getString("favorite_color"), rs.getString("college_program")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return records;
    }
}
