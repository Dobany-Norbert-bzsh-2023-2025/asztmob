package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeSource{
    Database database;
    public EmployeeSource(Database database) {
        this.database = database;
    }
    public ArrayList<Employee> getEmployees(){
        try
        {
            return tryGetEmployees();
        }
        catch(SQLException e)
        {
            System.err.println("Couldn't get employees");
            System.err.println(e.getMessage());
            return null;
        }
    }
    private ArrayList<Employee> tryGetEmployees() throws SQLException{
        Connection conn = database.connect();
        String sql = "SELECT * FROM EMPLOYEE";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ArrayList<Employee> empList = new ArrayList<Employee>();
        while(rs.next())
        {
            Employee emp = new Employee();
            emp.setId(rs.getInt("ID"));
            emp.setName(rs.getString("NAME"));
            emp.setCity(rs.getString("CITY"));
            emp.setSalary(rs.getDouble("SALARY"));
            empList.add(emp);
        }
        return empList;
    }

    public void addEmployee(Employee emp){
        try
        {
            tryAddEmployee(emp);
        }
        catch(SQLException e)
        {
            System.err.println("Couldn't add employee");
            System.err.println(e.getMessage());
        }
    }

    public void tryAddEmployee(Employee emp) throws SQLException{
        Connection conn = database.connect();
        String sql = """
                insert into emplyees
                (name, city, salary)
                values
                (?, ?, ?)
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, emp.getName());
        ps.setString(2, emp.getCity());
        ps.setDouble(3, emp.getSalary());
        int records = ps.executeUpdate();
        System.err.println(records);
    }
}
