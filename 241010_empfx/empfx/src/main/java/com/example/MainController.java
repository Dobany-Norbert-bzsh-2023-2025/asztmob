package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;;

public class MainController {

    EmployeeSource employeeSource;

    @FXML
    private TextField cityField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField salaryField;

    @FXML
    void OnClickAddButton(ActionEvent event) {
        startAddEmployee();
    }

    private void startAddEmployee() {
        Employee emp = new Employee();
        emp.setName(nameField.getText());
        emp.setCity(cityField.getText());
        emp.setSalary(Double.parseDouble(salaryField.getText()));
        employeeSource = new EmployeeSource(new Sqlite());
        employeeSource.addEmployee(emp);

    }

}
