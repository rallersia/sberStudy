package com.zoo.animal;

import com.zoo.exception.AddEqualAnimalException;
import com.zoo.exception.AddInNotExistingAviaryException;
import com.zoo.exception.OverfillingException;

import java.util.HashMap;

public class Aviarys extends HashMap<String, Aviary> {
    public void addAnimal(String nameOfAviary, Animal animal) throws AddInNotExistingAviaryException, AddEqualAnimalException, OverfillingException {
        if (!this.containsKey(nameOfAviary))
            throw new AddInNotExistingAviaryException("Can't add animal in not existing aviary \"" + nameOfAviary + "\"");
        this.get(nameOfAviary).add(animal);
    }
}
