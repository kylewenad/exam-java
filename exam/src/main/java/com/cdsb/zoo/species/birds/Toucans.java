package com.cdsb.zoo.species.birds;

import com.cdsb.zoo.enums.AnimalType;

public class Toucans extends Birds{

    private String vetCares;
    private String feedAnimal;
    private int spaceNeeded;

    public Toucans(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalType = AnimalType.TOUCAN;
        compatibles.add(AnimalType.PARROT);
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
    public int spaceNeeded(){
        return spaceNeeded;
    }

    @Override
    public String vetCares() {
        return vetCares;
    }

    @Override
    public String toString() {
        return "Toucans [vetCares=" + vetCares + ", feedAnimal=" + feedAnimal + ", spaceNeeded=" + spaceNeeded + "]";
    }


}
