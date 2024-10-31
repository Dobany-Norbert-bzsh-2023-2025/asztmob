package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField alphaField;

    @FXML
    private TextField areaField;

    @FXML
    private TextField sideField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    @FXML
    void onClickAboutButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About Button");
        alert.setHeaderText("Rombfx");
        alert.setContentText("About");
        alert.showAndWait();
    }

    private void startCalc()
    {
        String sideStr = sideField.getText();
        String alpaStr = alphaField.getText();

        Double side = Double.parseDouble(sideStr);
        Double alpha = Double.parseDouble(alpaStr);

        Double radAlpha = alpha * Math.PI / 180;
        Double area = Math.pow(side, 2) * Math.sin(radAlpha);

        System.out.println("Romb area = "+area);
        areaField.setText(area.toString());
    }

}
