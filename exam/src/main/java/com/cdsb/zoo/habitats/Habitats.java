package com.cdsb.zoo.habitats;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.enums.HabitatType;
import com.cdsb.zoo.species.Animals;
import com.cdsb.zoo.species.IAnimals;

public abstract class Habitats implements IHabitats{

    protected HabitatType habitatType;
    private String habitatName;
    protected Set<AnimalSpecies> compatibles;
    protected Set<AnimalSpecies> incompatibles;
   
    public Habitats(String habitatName) {
        this.habitatName = habitatName;
        compatibles = new HashSet<>();
        incompatibles = new HashSet<>();
    }

    @Override
    public String getHabitatName() {
        return habitatName;
    }

    public void setHabitatName(String habitatName) {
        this.habitatName = habitatName;
    }

    @Override
    public boolean isCompatibleHabitatType() {

        
        return false;
    }


}
