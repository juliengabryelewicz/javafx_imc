package com.juliengabryelewicz.imc;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ImcController {
    @FXML
    private Label imcLabel;

    @FXML
    private TextField heightField;

    @FXML
    private TextField weightField;

    private void showAlertWithoutHeaderText(String imcError) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Attention");

        // Header Text: null
        alert.setHeaderText(null);
        alert.setContentText(imcError);

        alert.showAndWait();
    }

    @FXML
    protected void onCalculateButtonClick() {

        try{
            double height = Double.parseDouble(heightField.getText().replace(",","."));
            double weight = Double.parseDouble(weightField.getText().replace(",","."));
            double imc = ImcModel.imcCalculate(weight, height);
            imcLabel.setText(ImcModel.getImcText(imc));
        } catch (Exception e) {
            showAlertWithoutHeaderText(e.getMessage());
        }
    }
}
