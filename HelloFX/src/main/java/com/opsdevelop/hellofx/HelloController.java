package com.opsdevelop.hellofx;

import io.github.cdimascio.dotenv.Dotenv;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    @FXML
    private TextField firstNameField, lastNameField, ageField, colorField, programField;

    @FXML
    private TableView<StudentRecord> recordTable;

    @FXML
    private TableColumn<StudentRecord, String> firstNameColumn, lastNameColumn, favoriteColorColumn, collegeProgramColumn;

    @FXML
    private TableColumn<StudentRecord, Integer> ageColumn;

    @FXML
    private Button submitButton, viewButton;

    private final PostgreSQLManager dbManager;
    private final ObservableList<StudentRecord> records;

    private static final Dotenv dotenv = Dotenv.configure().directory("src/main/resources").load();
    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASS = dotenv.get("DB_PASS");

    public HelloController() {
        dbManager = new PostgreSQLManager(URL, USER, PASS);
        records = FXCollections.observableArrayList();
    }

    @FXML
    public void initialize() {
        // Set up the table columns
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        favoriteColorColumn.setCellValueFactory(new PropertyValueFactory<>("favoriteColor"));
        collegeProgramColumn.setCellValueFactory(new PropertyValueFactory<>("collegeProgram"));

        // Link the data to the table
        recordTable.setItems(records);

        // Load table with existing records
        handleView();

        submitButton.setOnAction(event -> handleSubmit());
        viewButton.setOnAction(event -> handleView());
    }

    private void handleSubmit() {
        try {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String color = colorField.getText();
            String program = programField.getText();

            dbManager.addRecord(firstName, lastName, age, color, program);
            clearFields();
            showAlert("Success", "Record added successfully.", Alert.AlertType.CONFIRMATION);
        } catch (NumberFormatException e) {
            showAlert("Invalid Input", "Fill All Fields Correctly.", Alert.AlertType.ERROR);
        }
    }

    private void handleView() {
        records.clear();
        records.addAll(dbManager.getAllRecords());
    }

    private void clearFields() {
        firstNameField.clear();
        lastNameField.clear();
        ageField.clear();
        colorField.clear();
        programField.clear();
    }

    private void showAlert(String title, String message, Alert.AlertType type) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
