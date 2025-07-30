package com.cdsb.zoo.species.reptiles;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.species.Species;

public abstract class Reptiles extends Species{


    public Reptiles(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalSpecies = AnimalSpecies.REPTILES;
    }

    @Override
    public AnimalSpecies getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimals(AnimalSpecies animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

}
