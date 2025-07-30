package com.cdsb.zoo.species.mammals;

import com.cdsb.zoo.enums.AnimalType;

public class Lions extends Mammals{
    
    
    private String vetCares = "Periodic physical exams to assess the lions' overall health, including their weight, body condition, and vital signs.";
    private String feedAnimal = "Once every three days";
    private int spaceNeeded = 30;

    public Lions(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalType = AnimalType.LION;
        incompatible.add(AnimalType.ELEPHANT);
        incompatible.add(AnimalType.ZEBRA);
    }

    @Override
    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimals(AnimalType animalType) {
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
    
    
}
