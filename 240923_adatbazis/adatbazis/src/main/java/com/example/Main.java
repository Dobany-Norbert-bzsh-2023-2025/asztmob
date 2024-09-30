package com.example;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
        DataSource dataSource = new DataSource();
        ArrayList<Employee> employeeList = dataSource.getEmployees();
        System.out.println(employeeList.get(0).getName());
    }
}