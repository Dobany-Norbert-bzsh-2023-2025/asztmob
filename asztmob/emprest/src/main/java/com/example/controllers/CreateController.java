package com.example.controllers;

import com.example.models.Employee;
import com.example.models.EmployeeSource;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CreateController {

    @FXML
    private TextField cityField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField salaryField;

    @FXML
    void onClickAddButton(ActionEvent event) {
        Employee emp = new Employee();
        emp.setName(nameField.getText());
        emp.setCity(cityField.getText());
        emp.setSalary(Double.parseDouble(salaryField.getText()));
        System.out.println("Hozzáadás működik");

        EmployeeSource.createEmployee(emp);
    }

}
