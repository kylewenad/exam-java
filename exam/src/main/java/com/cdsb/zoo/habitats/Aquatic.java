package com.cdsb.zoo.habitats;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.enums.HabitatType;

public class Aquatic extends Habitats{

    public Aquatic(String habitatName) {
        super(habitatName);
        habitatType = HabitatType.AQUATIC;
        compatibles.add(AnimalSpecies.AQUATIC_ANIMALS);
        incompatibles.add(AnimalSpecies.MAMMALS);
        incompatibles.add(AnimalSpecies.BIRDS);
        incompatibles.add(AnimalSpecies.REPTILES);
    }

    @Override
    public HabitatType getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(HabitatType habitatType) {
        this.habitatType = habitatType;
    }

}
