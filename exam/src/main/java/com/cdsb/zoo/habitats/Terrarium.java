package com.cdsb.zoo.habitats;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.enums.HabitatType;

public class Terrarium extends Habitats {

    public Terrarium(String habitatName) {
        super(habitatName);
        habitatType = HabitatType.TERRARIUM;
        compatibles.add(AnimalSpecies.REPTILES);
        incompatibles.add(AnimalSpecies.AQUATIC_ANIMALS);
        incompatibles.add(AnimalSpecies.BIRDS);
        incompatibles.add(AnimalSpecies.MAMMALS);
    }

    @Override
    public HabitatType getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(HabitatType habitatType) {
        this.habitatType = habitatType;
    }

    public void isEmpty(){
        if()
    }
}
