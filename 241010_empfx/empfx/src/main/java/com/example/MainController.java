package com.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class MainController {
    @FXML
    void onClickListButton(ActionEvent event) {
        App.setRoot("listScene");
    }

    @FXML
    void onClickManageButton(ActionEvent event){
        App.setRoot("createScene");
        
    }
    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
    }

}
