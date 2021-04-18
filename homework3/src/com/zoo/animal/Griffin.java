package com.zoo.animal;

public class Griffin extends Animal implements Flyable, Gallopable{
    public Griffin() {
    }

    public Griffin(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("*squawk*");
    }

    @Override
    public void eat(String food) {
        System.out.println("Griffin is eating " + food + "...");
    }

    @Override
    public void eat() {
        System.out.println("Griffin is eating a lot of MEAT...");
    }

    @Override
    public void sleep() {
        System.out.println("Griffin is sleeping about 16 hours");
    }

    @Override
    public void fly() {
        System.out.println("Oh...Griffin was fled...");
    }

    @Override
    public void gallop() {
        System.out.println("WOW! Griffin " + name + " is running!");
    }
}
