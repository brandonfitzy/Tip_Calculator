package com.example.tip_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalcController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Calculating");
    }
}