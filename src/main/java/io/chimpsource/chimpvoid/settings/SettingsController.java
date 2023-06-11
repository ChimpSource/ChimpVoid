package io.chimpsource.chimpvoid.settings;

import io.chimpsource.chimpvoid.App;
import javafx.fxml.FXML;

import java.io.IOException;

public class SettingsController {
    @FXML
    protected void onBackButtonClick() throws IOException {
        App.setRoot("main");
        App.setTitle("ChimpVoid");
    }
}
