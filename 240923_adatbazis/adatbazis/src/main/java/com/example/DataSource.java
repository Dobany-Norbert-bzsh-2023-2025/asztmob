package com.example;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSource {
    public ArrayList<Employee> getEmployees(){
        try{
            return tryGetEmployees();
        }catch(SQLException e){
            System.err.println("Hiba! A lekerés sikertelen");
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Employee> tryGetEmployees() throws SQLException {
        Mariadb mariadb = new Mariadb();
        Connection connection = mariadb.connectDb();
        //operaciok ide
        Statement statement = connection.createStatement();
        String sql = "select * from employees";
        ResultSet resultSet = statement.executeQuery(sql);
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        while(resultSet.next())
        {
            Employee employee = new Employee();
            //System.out.println(resultSet.getString("city"));
            employee.setId(resultSet.getInt("id"));
            employee.setName(resultSet.getString("name"));
            employee.setCity(resultSet.getString("city"));
            employee.setSalary(resultSet.getDouble("salary"));
            employeeList.add(employee);
        }
        mariadb.closeDb(connection);
        return employeeList;
        
    }
}
