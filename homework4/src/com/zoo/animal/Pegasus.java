package com.zoo.animal;

public class Pegasus extends Animal implements Flyable, Shoeable{
    private Boolean isShoe = false;
    public Pegasus() {
    }

    public Pegasus(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("*neigh*");
    }

    @Override
    public void eat(String food) {
        System.out.println("Pegasus is eating " + food + "...");
    }

    @Override
    public void eat() {
        System.out.println("Pegasus is eating some clouds...");
    }

    @Override
    public void sleep() {
        System.out.println("Pegasus sleeping about 2.9 hours");
    }

    @Override
    public void fly() {
        System.out.println("Oh... Pegasus was fled...");
    }

    @Override
    public void shoe() {
        isShoe = false;
        System.out.println("Pegasus has been shoed!");
    }
}
