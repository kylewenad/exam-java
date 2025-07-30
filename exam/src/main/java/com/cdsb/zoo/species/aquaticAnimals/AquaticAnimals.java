package com.cdsb.zoo.species.aquaticAnimals;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.species.Species;

public abstract class AquaticAnimals extends Species{

    public AquaticAnimals(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalSpecies = AnimalSpecies.AQUATIC_ANIMALS;
    }

    @Override
    public AnimalSpecies getAnimalSpecies() {
        return animalSpecies;
    }

    public void setSpecies (AnimalSpecies animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

}
