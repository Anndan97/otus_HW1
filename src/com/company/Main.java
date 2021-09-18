package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Duck gg = new Duck("sd", 5, "5", "black");

        List<Animal> animal_list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String answer = "";
        String answer_animal = "";
        String name, weight, color = "";
        int age;

        while (!answer.equals("exit")) {
            System.out.println("menu");
            System.out.println("add");
            System.out.println("list");
            System.out.println("exit");
            answer = scanner.next().toLowerCase().trim();

            if (answer.equals(Move.add.toString())) {
                // можно, конечно запросить все через пробел, считать все строкой и разделить по пробелу, но тогда
                // придется пожертвовать .trim(), и все целом лень)))
                System.out.println("Какое животное - cat, dog, duck");
                answer_animal = scanner.next().toLowerCase().trim();
                System.out.println("Введите имя животного");
                name = scanner.next().toLowerCase().trim();
                System.out.println("Введите возраст животного");
                age = scanner.nextInt();
                System.out.println("Введите вес животного");
                weight = scanner.next().toLowerCase().trim();
                System.out.println("Введите цвет животного");
                color = scanner.next().toLowerCase().trim();
                if (answer_animal.equals("cat")){
                    Cat cat_name = new Cat (name, age, weight,color);
                    System.out.println(cat_name.Say());
                    animal_list.add(cat_name);
                }
                else if (answer_animal.equals("dog")){
                    Dog dog_name = new Dog (name, age, weight,color);
                    System.out.println(dog_name.Say());
                    animal_list.add(dog_name);
                }
                else if (answer_animal.equals("duck")){
                    Duck duck_name = new Duck (name, age, weight,color);
                    System.out.println(duck_name.Say());
                    animal_list.add(duck_name);
                }
            } else if (answer.equals(Move.list.toString())) {
                System.out.println(animal_list.toString());
            } else if (answer.equals(Move.exit.toString())) {
            }

        }

    }
}
