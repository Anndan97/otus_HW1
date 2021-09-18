package com.company;

public class Dog extends Animal {

    public Dog(String name, int age, String weigth, String color) {
        super(name, age, weigth, color);
    }

    @Override
    public boolean Say(){
        System.out.println("Гав!");
        return false;
    }
}
