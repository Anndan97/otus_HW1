package com.company;

public class Duck extends Animal implements Flying{


    public Duck(String name, int age, String weigth, String color){
        super(name, age, weigth, color);
    }


    @Override
    public boolean Say() {
        System.out.println("Кря");
        return false;
    }



    @Override
    public void Fly() {
        System.out.println("Я лечу");
    }
}
