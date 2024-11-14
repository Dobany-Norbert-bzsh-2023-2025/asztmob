package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class MainController {

    EmployeeSource source = new EmployeeSource();
    @FXML
    private TableColumn<Employee, Integer> idCol;

    @FXML
    private TableColumn<Employee, Double> salaryCol;

    @FXML
    private TableColumn<Employee, String> cityCol;

    @FXML
    private TableColumn<Employee, String> nameCol;

    @FXML
    private TableView<Employee> empTable;
    
    @FXML
    private Button addButton;

    @FXML
    private TextField cityField;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField idField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField salaryField;

    @FXML
    private Button updateButton;

    @FXML
    void onClickAddButton(ActionEvent event) {
        Employee emp = new Employee();
        emp.setName(nameField.getText());
        emp.setCity(cityField.getText());
        emp.setSalary(Double.parseDouble(salaryField.getText()));
        source.addEmployee(emp);
        reloadTable();
        inputFieldClear();
    }

    @FXML
    void onClickDeleteButton(ActionEvent event) {

    }

    @FXML
    void onClickUpdateButton(ActionEvent event) {

    }

    @FXML
    void onClickTable(MouseEvent event) {
         if (event.getButton().equals(MouseButton.PRIMARY) && event.getClickCount() == 2)
         {
            //System.out.println("dupla katt");
            //int index = empTable.getSelectionModel().getSelectedIndex();
            Employee emp = empTable.getSelectionModel().getSelectedItem();
            idField.setText(emp.getId().toString());
            nameField.setText(emp.getName());
            cityField.setText(emp.getCity());
            salaryField.setText(emp.getSalary().toString());
            
         }
    }

    public void initialize() {
        System.out.println("működik");
        
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

        reloadTable();
    }

    public void reloadTable()
    {
        empTable.getItems().clear();
        empTable.getItems().addAll(source.getEmployees());
    }

    public void inputFieldClear()
    {

        idField.setText("");
        nameField.setText("");
        cityField.setText("");
        salaryField.setText("");
    }

}
