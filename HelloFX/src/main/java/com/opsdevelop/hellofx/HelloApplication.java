package com.opsdevelop.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// BootstrapFX
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        GridPane root = fxmlLoader.load();
        Scene scene = new Scene(root, 640, 480);

        // Add an icon to the stage
        Image icon = new Image("https://upload.wikimedia.org/wikipedia/en/c/cc/JavaFX_Logo.png");
        stage.getIcons().add(icon);

        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm()); // Add Stylesheet to the scene
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet()); // Add BootstrapFX stylesheet to the scene

        stage.setTitle("User Information Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}