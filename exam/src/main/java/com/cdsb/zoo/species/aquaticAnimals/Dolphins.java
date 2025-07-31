package com.cdsb.zoo.species.aquaticAnimals;

import com.cdsb.zoo.enums.AnimalType;

public class Dolphins extends AquaticAnimals{

    private String vetCares;
    private String feedAnimal;
    private int spaceNeeded;
    
    public Dolphins(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalType = AnimalType.DOLPHIN;
        compatibles.add(AnimalType.DOLPHIN);
        compatibles.add(AnimalType.SEAL);
    }

    @Override
    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimals(AnimalType animalType) {
        this.animalType = animalType;
    }

     @Override
    public String feedAnimal() {
        return feedAnimal;
    }

    @Override
    public int spaceNeeded() {
        return spaceNeeded;
    }

    @Override
    public String vetCares() {
        return vetCares;
    }

    @Override
    public String toString() {
        return "Dolphins [vetCares=" + vetCares + ", feedAnimal=" + feedAnimal + ", spaceNeeded=" + spaceNeeded + "]";
    }

}
