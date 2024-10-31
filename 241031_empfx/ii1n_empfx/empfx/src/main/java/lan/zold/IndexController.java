package lan.zold;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class IndexController {

     @FXML
    private TextField salaryField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField idField;

    @FXML
    private TextField cityField;

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

        employeeSource = new EmployeeSource(new Sqlite());

       setEmpTable();

        // empTable.getItems()
        // .add(new Employee(1, "Ernő", "Pécs", 395.0));
    }

    private void setEmpTable()
    {
        ArrayList<Employee> emps = employeeSource.getEmployees();
        ObservableList<Employee> empList = 
            FXCollections.observableArrayList(emps);
        
        empTable.setItems(empList);
    }

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void onClickTableView(MouseEvent event) {
        if(event.getClickCount() == 2)
        {
            Employee emp = empTable.getSelectionModel().getSelectedItem();
            idField.setText(emp.getId().toString());
            nameField.setText(emp.getName());
            cityField.setText(emp.getCity());
            salaryField.setText(emp.getSalary().toString());

        }
    }

    @FXML
    void onClickModifyButton(ActionEvent event) {
        Employee emp = new Employee();
        emp.setId(Integer.parseInt(idField.getText()));
        emp.setName(nameField.getText());
        emp.setCity(cityField.getText());
        emp.setSalary(Double.parseDouble(salaryField.getText()));

        employeeSource.updateEmployee(emp);
        setEmpTable();
        idField.setText("");
        nameField.setText("");
        cityField.setText("");
        salaryField.setText("");
    }

    @FXML
    void onClickDeleteButton(ActionEvent event) {
        System.out.println("delete");
        Employee emp = empTable.getSelectionModel().getSelectedItem();
        employeeSource.deleteEmployee(emp.getId());
        System.out.println(emp.getId());
    }

}