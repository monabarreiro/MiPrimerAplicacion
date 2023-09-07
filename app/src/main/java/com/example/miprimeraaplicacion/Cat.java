package com.example.miprimeraaplicacion;

public class Cat {
    private int age;
    private String name;
    private String color;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;

    }
}
