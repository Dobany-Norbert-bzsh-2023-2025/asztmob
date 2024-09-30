package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Triangle Calculator");

        Triangle triangle = new Triangle(3, 4);
        Triangle triangle2 = new Triangle(5, 12, 13);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle2.calculatePerimeter());
    }
}