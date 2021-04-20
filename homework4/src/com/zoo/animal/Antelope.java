package com.zoo.animal;

public class Antelope extends Animal implements Gallopable, Shoeable{
    private Boolean isShoe = false;
    public Antelope() {
    }

    public Antelope(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("*snort*");
    }

    @Override
    public void eat(String food) {
        System.out.println("Antelope is eating " + food + "...");
    }

    @Override
    public void eat() {
        System.out.println("Antelope is eating grass...");
    }

    @Override
    public void sleep() {
        System.out.println("Antelope is sleeping about 3 hours");
    }

    @Override
    public void gallop() {
        System.out.println("WOW! Antelope " + name + " is running!");
    }

    @Override
    public void shoe() {
        isShoe = true;
        System.out.println("Antelope has been shoed!");
    }
}
