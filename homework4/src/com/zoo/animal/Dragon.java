package com.zoo.animal;

public class Dragon extends Animal implements AbleToWashUp, Attackable{
    public Dragon() {
    }

    public Dragon(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("*ROOOOOAR*");
    }

    @Override
    public void eat(String food) {
        System.out.println("Dragon is eating " + food + "...");
    }

    @Override
    public void eat() {
        System.out.println("Dragon is eating a lot of MEAT...");
    }

    @Override
    public void sleep() {
        System.out.println("Dragon is sleeping about 10 hours");
    }

    @Override
    public void washUp() {
        System.out.println("Dragon is washing up!");
    }

    @Override
    public void attack() {
        System.out.println("You was attacked by Dragon");
    }
}
