package com.cdsb.zoo.species;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.enums.AnimalType;

public interface IAnimals {

    String getNameOfTheAnimal();

    AnimalSpecies getAnimalSpecies();
    AnimalType getAnimalType();

    Boolean canLiveTogether(IAnimals animals);
   
}
