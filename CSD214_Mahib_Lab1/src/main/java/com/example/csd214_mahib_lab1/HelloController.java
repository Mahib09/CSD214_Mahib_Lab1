package com.example.csd214_mahib_lab1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onloadbuttonClicked() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}