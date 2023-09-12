package com.serenitydojo;

public abstract class Pet {
    private String name;

    public String getName() {
        return name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String play();
}

