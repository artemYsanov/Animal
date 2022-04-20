package com.company;

public class Animal{

    String food;
    String location;

    Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public void makeNoise(){
        System.out.println("храпит");
    }
    public void eat(){
        System.out.println("голодный");
    }
    public void sleep(){
        System.out.println("спит");
    }
}