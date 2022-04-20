package com.company;
import java.util.Scanner;

public class Mein {
    public static void main(String[] args){

        System.out.println("Выберите  цифру одного из следующих животных (1, 2 или 3): Собака, Кот, Лошадь");

        Scanner scanner = new Scanner(System.in);
        int type_animal = scanner.nextInt();

        if(type_animal == 1) {
            Dog dog = new Dog("Куриные лапки", "Будка");
            dog.eat();
            dog.sleep();
            dog.makeNoise();
            dog.health();
        }
        else if(type_animal == 2) {
            Cat cat = new Cat("Рыбка", "Дом");
            cat.eat();
            cat.sleep();
            cat.makeNoise();
            cat.health();
        }
        else if(type_animal == 3) {
            Horse horse = new Horse("Морковь", "Сарай");
            horse.eat();
            horse.sleep();
            horse.makeNoise();
            horse.health();
        }
    }
}