package com.example;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

import kong.unirest.core.HttpResponse;
import kong.unirest.core.Unirest;


class User {
  int id;
  String name;

  public User(int id, String name) {
      this.id = id;
      this.name = name;        
  }

  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }
  
}



public class UnirestExample {
  public static void unirest() {
    String url = "https://jsonplaceholder.typicode.com/users";

    HttpResponse<String> response = Unirest.get(url)
      .header("Accept", "application/json")
      .asString();
    
    String json = response.getBody();
    System.out.println(json);

    Gson gson = new Gson();
    User[] users = gson.fromJson(json, User[].class);
    ArrayList<User> userList = new ArrayList<>(Arrays.asList(users));
    for (User user : userList) {
        System.out.println(user.getId() + " " + user.getName());
    }      
  }


}

