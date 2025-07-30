package com.cdsb.zoo.species.mammals;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.enums.AnimalType;
import com.cdsb.zoo.enums.HabitatsType;
import com.cdsb.zoo.enums.AnimalSpecies;

public class Lions extends Mammals{

   
    protected Set<AnimalType> compatible;
    protected Set<AnimalType> incompatible;
    String veterinaryCare;
    HabitatsType habitats;
    AnimalSpecies species;


    @Override
    public AnimalType getAnimal() {
        return AnimalType.LION;
    }

    public void setAnimals(AnimalType animals) {
        this.animals = animals;
    }
    
    @Override
    public HabitatsType getSHabitatAnimal() {
        return HabitatsType.TERRESTRIAL;
    }

    public void setHabitat(HabitatsType habitats) {
        this.habitats = habitats;
    }
    @Override
    public String getVeterinaryCare() {
        return veterinaryCare;
    }
    @Override
    public Boolean isPredator() {
        if(AnimalType.equals())
        return true;
    }
    
    
}
