package com.cdsb.zoo.habitats;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.enums.HabitatType;


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
    public boolean isCompatibleHabitatType(IHabitats habitats) {
        if(incompatibles.contains(habitats.getHabitatType()))
            if (compatibles.contains(habitats.getHabitatType())){
                return true;
            }
        
        return false;
    }

}
