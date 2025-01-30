package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;

public class MainController {
     
String[] animals = {
  "Lion",
  "Tiger",
  "Bear",
  "Monkey",
  "Giraffe",
  "Elephant",
  "Kangaroo",
  "Penguin",
  "Koala",
  "Crocodile",
  "Hippopotamus",
  "Rhino",
  "Zebra",
  "Cheetah",
  "Hyena",
  "Chimpanzee",
  "Gorilla",
  "Wolf",
  "Fox",
  "Raccoon"
};

    CheckBox[] animalCheckbox = new CheckBox[animals.length];

    @FXML
    private void initialize() {
        for (int i = 0; i < animals.length; i++) {
            animalCheckbox[i] = new CheckBox(animals[i]);
            grid.add(animalCheckbox[i], i % 4, i / 4);
        }
        for(CheckBox box : animalCheckbox) {
            box.selectedProperty().addListener((observable, oldValue, newValue) -> {System.out.println("works");});
        }
    }

    @FXML
    private GridPane grid;

    @FXML
    void onStartButtonClick(ActionEvent event) {

    }

}
