package com.zoo.animal;

public class Lion extends Animal implements Attackable, AbleToWashUp{
    Boolean isClean = false;
    public Lion() {
    }

    public Lion(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("*ROAR*");
    }

    @Override
    public void eat(String food) {
        System.out.println("Lion is eating " + food + "...");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating antelope...");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping about 18 hours");
    }

    @Override
    public void washUp() {
        if (!isClean) {
            isClean = true;
            System.out.println("Lion is washing up!");
        } else
            System.out.println("Lion already be cleaned");
    }

    @Override
    public void attack() {
        System.out.println("wtf? It's a zoo!");
    }
}
