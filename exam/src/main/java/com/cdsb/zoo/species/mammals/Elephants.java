package com.cdsb.zoo.species.mammals;

import com.cdsb.zoo.enums.AnimalType;

public class Elephants extends Mammals{

    private String vetCares;
    private String feedAnimal;
    private int spaceNeeded;

    public Elephants(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalType = AnimalType.ELEPHANT;
        compatibles.add(AnimalType.ZEBRA);
        incompatibles.add(AnimalType.LION);
    }

    @Override
    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimals(AnimalType animalType){
        this.animalType = animalType;
    }

    
    @Override
    public String vetCares() {
        return vetCares;
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
    public String toString() {
        return "Elephants [vetCares=" + vetCares + ", feedAnimal=" + feedAnimal + ", spaceNeeded=" + spaceNeeded + "]";
    }

}
