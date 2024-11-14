package com.example.controllers;

import com.example.App;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAddButton(ActionEvent event) {
        startAdd();
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

    private void startAdd() {
        System.out.println("Hozzáadás működik");
        App.setRoot("createScene");
    }

}
