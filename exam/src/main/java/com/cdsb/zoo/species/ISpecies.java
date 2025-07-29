package com.cdsb.zoo.species;

import com.cdsb.zoo.enums.Specie;
import com.cdsb.zoo.enums.Animals;
import com.cdsb.zoo.enums.Habitats;


public interface ISpecies {

    String getNameOfTheAnimal();

    Specie getSpecie();
    Animals getAnimal();

    Habitats getSHabitatAnimal();

    String getVeterinaryCare();

    Boolean isCompatible(ISpecies Species);
    Boolean isPredator();
    
}
