package com.example.models;

import com.google.gson.Gson;

import kong.unirest.core.HttpResponse;
import kong.unirest.core.Unirest;

public class EmployeeSource {
  public static void createEmployee(Employee emp) {
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
}
