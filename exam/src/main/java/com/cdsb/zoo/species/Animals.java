package com.cdsb.zoo.species;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.enums.AnimalType;

public abstract class Animals implements IAnimals{

    protected AnimalType animalType;
    protected AnimalSpecies animalSpecies;
    protected Set<AnimalType> compatibles;
    protected Set<AnimalType> incompatibles;

    private String nameOfTheAnimal;
    
    
    public Animals(String nameOfTheAnimal) {
        this.nameOfTheAnimal = nameOfTheAnimal;
        compatibles = new HashSet<>();
        incompatibles = new HashSet<>();
    }

    @Override
    public String getNameOfTheAnimal() {
        return nameOfTheAnimal;
    }

    public void setNameOfTheAnimal(String nameOfTheAnimal){
        this.nameOfTheAnimal = nameOfTheAnimal;
    }

    @Override
    public Boolean canLiveTogether(IAnimals animals) {
        if(compatibles.contains(animals.getAnimalType()))
        
        if(incompatibles.contains(animals.getAnimalType())){
            return false;
        }
        return true;
    }
}
