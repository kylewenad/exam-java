package com.cdsb.zoo.species;

import com.cdsb.zoo.enums.Animals;
import com.cdsb.zoo.enums.Habitats;
import com.cdsb.zoo.enums.Species;

public interface ISpecies {

    String getNameOfTheAnimal();

    Species getSpecies();
    Animals getAnimal();

    Habitats getSHabitatAnimal();

    String getVeterinaryCare();

    Boolean isPredator();
    Boolean isCompatible();
    
}
