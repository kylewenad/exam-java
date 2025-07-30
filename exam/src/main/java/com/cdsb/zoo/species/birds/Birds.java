package com.cdsb.zoo.species.birds;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.species.Species;

public abstract class Birds extends Species{

    public Birds(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalSpecies = AnimalSpecies.BIRDS;
    }

    @Override
    public AnimalSpecies getAnimalSpecies() {
        return animalSpecies;
    }

    public void setSpecies(AnimalSpecies animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

}
