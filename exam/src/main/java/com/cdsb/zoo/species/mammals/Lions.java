package com.cdsb.zoo.species.mammals;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.enums.Animals;
import com.cdsb.zoo.enums.Habitats;
import com.cdsb.zoo.enums.Specie;

public class Lions extends Mammals{

   
    protected Set<Animals> compatible;
    protected Set<Animals> incompatible;
    String veterinaryCare;
    Habitats habitats;
    Specie species;


    @Override
    public Animals getAnimal() {
        return Animals.LION;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }
    
    @Override
    public Habitats getSHabitatAnimal() {
        return Habitats.TERRESTRIAL;
    }

    public void setHabitat(Habitats habitats) {
        this.habitats = habitats;
    }
    @Override
    public String getVeterinaryCare() {
        return veterinaryCare;
    }
    @Override
    public Boolean isPredator() {
        if(Animals.equals())
        return true;
    }
    
    
}
