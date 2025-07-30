package com.cdsb.zoo.species;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.enums.AnimalType;

public abstract class Animals implements IAnimals{

    protected AnimalType animalType;
    protected Set<AnimalType> compatible;
    protected Set<AnimalType> incompatible;

    private String nameOfTheAnimal;
    
    
    public Animals(String nameOfTheAnimal) {
        this.nameOfTheAnimal = nameOfTheAnimal;
        compatible = new HashSet<>();
        incompatible = new HashSet<>();
    }

    @Override
    public String getNameOfTheAnimal() {
        return nameOfTheAnimal;
    }

    public void setNameOfTheAnimal(String nameOfTheAnimal){
        this.nameOfTheAnimal = nameOfTheAnimal;
    }

}
