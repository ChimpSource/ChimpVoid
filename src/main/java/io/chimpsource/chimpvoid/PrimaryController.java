package io.chimpsource.chimpvoid;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class PrimaryController {
    @FXML
    private Label welcomeText;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onMessagesButtonClick() {
        System.out.println("Hello, World!");
    }
    @FXML
    protected void onSettingsButtonClick() {
        try {
//            FXMLLoader fxmlLoader = new FXMLLoader();
//            fxmlLoader.setLocation(getClass().getResource("settings.fxml"));
//            /*
//             * if "fx:controller" is not set in fxml
//             * fxmlLoader.setController(NewWindowController);
//             */
//            Scene scene = new Scene(fxmlLoader.load());
//            Stage stage = new Stage();
//            stage.setTitle("Settings");
//            stage.setScene(scene);
//            stage.show();
            App.setRoot("settings");
            App.setTitle("Settings");
    } catch (IOException e) {
            throw new RuntimeException(e);
        }}
    @FXML
    protected void onQuitButtonClick() {
        System.exit(0);
    }
}