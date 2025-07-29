package com.cdsb.zoo.species.mammals;

import java.util.Set;

import com.cdsb.zoo.enums.Animals;
import com.cdsb.zoo.enums.Habitats;
import com.cdsb.zoo.enums.Species;

public class Lions extends Mammals{

    protected Set<Species> compatible;
    protected Set<Species> incompatible;

    String veterinaryCare;
    Habitats habitats;
    Species species;

    public Lions(String nameOfAnimal, Species species, Set<Species> compatible, Set<Species> incompatible,
            String veterinaryCare, Habitats habitats) {
        super(nameOfAnimal, species, compatible, incompatible);
        this.veterinaryCare = veterinaryCare;
        this.habitats = habitats;
    }

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
        return true;
    }
    
    
}
