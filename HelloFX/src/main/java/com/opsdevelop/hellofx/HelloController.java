package com.opsdevelop.hellofx;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField ageField;

    @FXML
    private TextField programField;

    @FXML
    private ComboBox<String> colorComboBox;

    @FXML
    private Label messageLabel;

    @FXML
    private void onSubmitButtonClick() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String ageText = ageField.getText();
        String program = programField.getText();
        String favoriteColor = colorComboBox.getValue();

        // Validate input
        if (firstName.isBlank() || lastName.isBlank() || ageText.isBlank() || program.isBlank() || favoriteColor == null) {
            showAlert("Input Error", "Please fill in all fields.");
            return;
        }

        try {
            int age = Integer.parseInt(ageText);

            // Display custom message with the collected information
            messageLabel.setText(String.format("Hello %s %s!\nYour Age is %d\nYour favorite color is %s and you're enrolled in the %s program.",
                    firstName, lastName, age, favoriteColor, program));

            // Clear input fields
            firstNameField.clear();
            lastNameField.clear();
            ageField.clear();
            programField.clear();
            colorComboBox.setValue(null);
        } catch (NumberFormatException e) {
            showAlert("Input Error", "Age must be a valid number.");
        }
    }

    // Utility method to show alert dialog
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void initialize() {
        // Initialize the color ComboBox with some example color choices
        colorComboBox.setItems(FXCollections.observableArrayList("Red", "Blue", "Green", "Yellow", "Purple"));
    }
}
