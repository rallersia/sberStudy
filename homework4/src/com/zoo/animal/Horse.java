package com.zoo.animal;

public class Horse extends Animal implements Shoeable, Gallopable{
    protected Boolean isShoe = false;

    public Horse() {
    }

    public Horse(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("*neigh*");
    }

    @Override
    public void eat() {
        System.out.println("Horse eating apple...");
    }

    @Override
    public void eat(String food) {
        System.out.println("Horse eating " + food + "...");
    }

    @Override
    public void sleep() {
        System.out.println("Horse sleeping about 3 hours");
    }

    @Override
    public void shoe() {
        isShoe = true;
        System.out.println("Horse has been shoed!");
    }

    @Override
    public void gallop() {
        System.out.println("WOW! Horse " + name + " is running!");
    }
}
