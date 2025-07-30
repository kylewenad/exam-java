package com.cdsb.zoo.species.mammals;

import com.cdsb.zoo.enums.AnimalType;

public class Zebras extends Mammals {

    private String vetCares;
    private String feedAnimal;
    private int spaceNeeded;


    public Zebras(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalType = AnimalType.ZEBRA;
        compatibles.add(AnimalType.ELEPHANT);
        incompatibles.add(AnimalType.LION);
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
        return "Zebras [vetCares=" + vetCares + ", feedAnimal=" + feedAnimal + ", spaceNeeded=" + spaceNeeded + "]";
    }

}
