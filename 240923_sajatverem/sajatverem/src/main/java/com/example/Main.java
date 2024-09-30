package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        SajatVerem<Integer> v = new SajatVerem<>(10);
        v.push(10);
        v.push(20);
        v.push(30);
        v.push(40);
        v.push(50);
        System.out.println(v.pop());
        System.out.println(v.pop());
        System.out.println(v.pop());
        System.out.println(v.pop());
        System.out.println(v.pop());
    }
}