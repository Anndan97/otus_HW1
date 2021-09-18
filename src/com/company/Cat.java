package com.company;

public class Cat extends Animal {

    public Cat(String name, int age, String weigth, String color){
        super(name, age, weigth, color);
    }

    @Override
    public boolean Say() {
        System.out.println("Мяу");
        return false;
    }
}
