package com.cdsb.zoo.habitats;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.enums.HabitatType;

public class Terrestrial extends Habitats{

    public Terrestrial(String habitatName) {
        super(habitatName);
        habitatType = HabitatType.TERRESTRIAL;
        compatibles.add(AnimalSpecies.MAMMALS);
        compatibles.add(AnimalSpecies.BIRDS);
    }

    @Override
    public HabitatType getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(HabitatType habitatType) {
        this.habitatType = habitatType;
    }

    @Override
    public boolean isCompatibleHabitatType() {
        if (habitatType.equals(habitatType.getHabitatType()))
            add(habitatType.AQUATIC);

        return false;
    }
    
}
