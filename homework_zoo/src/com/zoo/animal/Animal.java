package com.zoo.animal;

import com.zoo.exception.*;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
