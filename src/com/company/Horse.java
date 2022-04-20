package com.company;

class Horse extends Animal{

    private String unique_factor = "Быстро скачет";

    Horse(String food, String location){

        super(food, location);

    }
    public void eat(){
        System.out.println("Лошадь ест");
    }

    public void sleep(){
        System.out.println("Лошадь не спит");
    }

    public void makeNoise(){
        System.out.println("Чавкает");
    }

    public void health(){
        System.out.println(unique_factor);
        Animal horse = new Horse(food, location);
        System.out.println("Лошадь на приёме у ветеринара");
        Veterinar veterinar = new Veterinar();
        veterinar.treatAnimal(horse);
    }
}