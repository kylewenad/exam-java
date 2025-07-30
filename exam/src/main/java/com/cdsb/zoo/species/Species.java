package com.cdsb.zoo.species;

import com.cdsb.zoo.enums.AnimalSpecies;

public abstract class Species extends Animals{  

    private int spaceNeeded;
    private String feeding;
    private String vetCares;
    
    public Species(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
    }

    @Override
    public AnimalSpecies getAnimalSpecies() {
        return getAnimalSpecies();
    }
    
    public int spaceNeeded() {
        return spaceNeeded;
    }

    public String feedAnimal(){
        return feeding;
    }

    public String vetCares(){
        return vetCares;
    }

}
    


