package com.company;

public class Cat extends Animal {

    private String Say;

    public Cat(String name, String age, String weigth, String color){
        super(name, age, weigth, color);
    }


    public String getSay() {
        return Say = "Мяу";
    }

    public void setSay(String say) {
        Say = say;
    }
}
