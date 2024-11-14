/*
* File: MainController.java
* Author: Dobány Norbert Andor
* Copyright: 2024, Dobány Norbert Andor
* Group: Szoft II/1/N
* Date: 2024-11-09
* Github: https://github.com/notdefinitelynot/
* Licenc: GNU GPL
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField areaField;

    @FXML
    private TextField sideFieldA;

    @FXML
    private TextField sideFieldB;

    @FXML
    private TextField sideFieldC;

    @FXML
    private TextField sideFieldD;

    @FXML
    void onClickAboutButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("2024-11-07 Dol - Trapéz Terület Számító");
        alert.setContentText("Dobány Norbert Andor\n2024.11.09\nSzoft II/1/N");
        alert.showAndWait();
    }

    @FXML
    void onClickCalcButton(ActionEvent event) {
        startCalc();
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        System.exit(0);
    }

    private void startCalc() 
    {
        String sideStrA = sideFieldA.getText();
        String sideStrB = sideFieldB.getText();
        String sideStrC = sideFieldC.getText();
        String sideStrD = sideFieldD.getText();

        Double sideA = Double.parseDouble(sideStrA);
        Double sideB = Double.parseDouble(sideStrB);
        Double sideC = Double.parseDouble(sideStrC);
        Double sideD = Double.parseDouble(sideStrD);

        Double area = ((sideA+sideC)/(4*(sideA-sideC)))*Math.sqrt((sideA+sideB-sideC+sideD)*(sideA-sideB-sideC+sideD)*(sideA+sideB-sideC-sideD)*(-sideA+sideB+sideC+sideD));
        areaField.setText(area.toString());
        
    }
}
