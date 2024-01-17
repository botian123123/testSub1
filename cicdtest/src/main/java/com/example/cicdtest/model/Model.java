package com.example.cicdtest.model;

public class Model {

    String name = "old john";
    int age = 99;

    public void speak() {
        System.out.println("name : " + this.name + " age : " + this.age);
    }
}