package com.company;

public class Animal<iTens> {

    private String name;
    private int age;
    private String weigth;
    private String color;

    public Animal(String name, int age, String weigth, String color) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.color = color;
    }

    public boolean Say() {
        System.out.println("Я говорю!");
        return false;
    }

    public void Go() {
        System.out.println("Я иду!");
    }

    public void Drink() {
        System.out.println("Я пью!");
    }

    public void Eat() {
        System.out.println("Я ем!");
    }


    @Override
    public String toString() {
        int iTens = age % 10;

//        String old = "";
//
//        if(iTens == 1){
//            old = "год";
//        }
//        else if(iTens == 0 || iTens >= 5 && iTens <= 9){
//            old = "лет";
//        }
//        else if(iTens >=2&&iTens <=4){
//            old ="года";
//        }
        return "Привет! Меня зовут " + name + " мне " + age + " "
                + ((iTens == 1)? "год" :((iTens < 5 & iTens !=0) ? "года": "лет"))+ ", я вешу " + weigth + " мой цвет " + color;
    }
}
