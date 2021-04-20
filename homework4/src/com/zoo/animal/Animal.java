package com.zoo.animal;

import com.zoo.exception.*;

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
    public void setName(String name) throws emptyNameException {
        if (name.equals(""))
            throw new emptyNameException("Name is empty!");
        this.name = name;
    }
    public abstract void say();
    public abstract void eat(String food) throws emptyFoodException;
    public abstract void eat();
    public abstract void sleep();
}
