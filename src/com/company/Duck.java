package com.company;

public class Duck extends Animal implements Flying{

    private String Say;

    public Duck(String name, String age, String weigth, String color){
        super(name, age, weigth, color);
    }

    public String getSay() {
        return Say = "Кря";
    }

    public void setSay(String say) {
        Say = say;
    }

    @Override
    public void Fly() {
        System.out.println("Я лечу");
    }
}
