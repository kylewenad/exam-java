package com.cdsb.zoo.species.reptiles;

import com.cdsb.zoo.enums.AnimalType;

public class Snakes extends Reptiles{
    private String vetCares;
    private String feedAnimal;
    private int spaceNeeded;
    
    public Snakes(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalType = AnimalType.SNAKE;
        incompatibles.add(AnimalType.SNAKE);
        incompatibles.add(AnimalType.IGUANA);
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



}
