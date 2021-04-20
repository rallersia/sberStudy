package com.zoo.animal;

public abstract class Animal {
    protected String name;

    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void say();
    public abstract void eat(String food);
    public abstract void eat();
    public abstract void sleep();
}
