package com.example;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

import kong.unirest.core.HttpResponse;
import kong.unirest.core.Unirest;

class Employee {
  Integer id;
  String name;
  String city;
  Double salary;
}

public class UnirestEmployee {
  
  static String url = "http://[::1]:8000/employees";

  public static void getEmployees() {

    HttpResponse<String> response = Unirest.get(url)
      .header("Accept", "application/json")
      .asString();

    String json = response.getBody();
    System.out.println(json);

    Gson gson = new Gson();
    Employee[] employees = gson.fromJson(json, Employee[].class);
    ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(employees));

    for (Employee employee : empList) {
      System.out.println(employee.id + " " + employee.name);
    }
  }
  public static void addEmployee() {
    Employee emp = new Employee();
    emp.name = "Fizi Mihály";
    emp.city = "Szeged";
    emp.salary = 392.0;
    Gson gson = new Gson();
    String json = gson.toJson(emp);

    HttpResponse<String> response = Unirest.post(url)
      .header("Accept", "application/json")
      .header("Content-Type", "application/json")
      .body(json)
      .asString();

    String jsonRes = response.getBody();
    // System.out.println(jsonRes);

    Employee employee = gson.fromJson(jsonRes, Employee.class);
    System.out.println(employee.name);
  }

  public static void updateEmployee() {
    url = url + "/5";
    Employee emp = new Employee();
    emp.name = "Táncos Tibor";
    emp.city = "Pécs";
    emp.salary = 389.0;
    Gson gson = new Gson();
    String json = gson.toJson(emp);

    HttpResponse<String> response = Unirest.put(url)
      .header("Accept", "application/json")
      .header("Content-Type", "application/json")
      .body(json)
      .asString();

    String jsonRes = response.getBody();
    System.out.println(jsonRes);
    Employee employee = gson.fromJson(jsonRes, Employee.class);
    System.out.println(employee.name);
  }

  public static void deleteEmployee() {
    url = url + "/4";
    HttpResponse<String> response = Unirest.delete(url)
      .header("Accept", "application/json")
      .asString();
    String json = response.getBody();
    System.out.println(json);
  }
}
