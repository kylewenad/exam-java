package com.cdsb.zoo.species.aquaticAnimals;

import com.cdsb.zoo.enums.AnimalType;

public class Seals extends AquaticAnimals{

    private String vetCares;
    private String feedAnimal;
    private int spaceNeeded;

    public Seals(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalType = AnimalType.SEAL;
        compatibles.add(AnimalType.SEAL);
        compatibles.add(AnimalType.DOLPHIN);
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
        return "Seals [vetCares=" + vetCares + ", animalSpecies=" + animalSpecies + ", feedAnimal=" + feedAnimal
                + ", spaceNeeded=" + spaceNeeded + ", animalType=" + animalType + "]";
    }

}
