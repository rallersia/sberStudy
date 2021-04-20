package com.zoo.animal;

public class Tiger extends Animal implements Attackable, AbleToWashUp{
    private Boolean isClean = false;

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("*ROAR*");
    }

    @Override
    public void eat(String food) {
        System.out.println("Tiger eating " + food + "...");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eating a lot of MEAT...");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeping about 16 hours");
    }

    @Override
    public void washUp() {
        if (!isClean) {
            isClean = true;
            System.out.println("Tiger is washing up!");
        } else
            System.out.println("Tiger already be cleaned");
    }

    @Override
    public void attack() {
        System.out.println("wtf? It's a zoo!");
    }
}
