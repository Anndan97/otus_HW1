package com.company;

public class Dog extends Animal {

    private String Say;

    public Dog(String name, String age, String weigth, String color) {
        super(name, age, weigth, color);
    }

    public String getSay() {
        return Say = "Гав";
    }

    public void setSay(String say) {
        Say = say;
    }
}
