package com.cdsb.zoo.habitats;

import java.util.Set;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.enums.HabitatType;
import com.cdsb.zoo.species.IAnimals;

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

    @Override
    public String toString() {
        return "Aquatic []";
    }

    @Override
    public Set<IAnimals> getAnimals() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnimals'");
    }

}
