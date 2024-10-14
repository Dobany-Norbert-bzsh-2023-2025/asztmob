package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListController {

    EmployeeSource employeeSource;

    @FXML
    private TableColumn<Employee, String> cityCol;

    @FXML
    private TableView<Employee> empTable;

    @FXML
    private TableColumn<Employee, Integer> idCol;

    @FXML
    private TableColumn<Employee, String> nameCol;

    @FXML
    private TableColumn<Employee, Double> salaryCol;

    @FXML
    void initialize() {
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
        
        //empTable.getItems().add(new Employee(1, "a", "a", 1.0));

        employeeSource = new EmployeeSource(new Sqlite());
        ArrayList<Employee> employees = employeeSource.getEmployees();
        ObservableList<Employee> empList = FXCollections.observableArrayList(employees);
        //empTable.getItems().addAll(empList);
        empTable.setItems(empList);
    }

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void onClickExitButton(ActionEvent event) {
        Platform.exit();
    }   

}
