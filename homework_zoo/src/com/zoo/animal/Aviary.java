package com.zoo.animal;

import java.util.ArrayList;
import com.zoo.exception.OverfillingAviaryException;
import com.zoo.exception.AddEqualAnimalException;

public class Aviary {
    final Integer MAX_SIZE = 10;
    private final ArrayList<Animal> animals;
    {
        animals = new ArrayList<>(MAX_SIZE);
    }
    public void add(Animal animal) throws OverfillingAviaryException, AddEqualAnimalException{
        if (animals.size() == MAX_SIZE)
            throw new OverfillingAviaryException("Can't add new animal! Max size = " + MAX_SIZE.toString());
        if (animals.contains(animal))
            throw new AddEqualAnimalException("Can't adding equal animals");
        animals.add(animal);
    }
    public boolean remove(Animal animal) {
        return (animals.remove(animal));
    }
    public int size() {
        return (animals.size());
    }
}
