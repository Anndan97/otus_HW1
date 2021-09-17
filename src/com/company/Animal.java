package com.company;

public class Animal {

    private  String name;
    private String age;
    private String weigth;
    private String color;
    private String Say;
    private String Go;
    private String Drink;
    private String Eat;

    public Animal(String name, String age, String weigth, String color) {
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.color = color;
    }

    public String getSay() {
        return Say = "Я говорю";
    }

    public void setSay(String say) {
        Say = "Я говорю";
    }

    public String getGo() {
        return Go = "Я иду";
    }

    public void setGo(String go) {
        Go = go;
    }

    public String getDrink() {
        return Drink = "Я пью";
    }

    public void setDrink(String drink) {
        Drink = drink;
    }

    public String getEat() {
        return Eat = "Я ем";
    }

    public void setEat(String eat) {
        Eat = eat;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " мне " + age + " лет, я вешу " + weigth + " мой цвет " + color;
    }

}
