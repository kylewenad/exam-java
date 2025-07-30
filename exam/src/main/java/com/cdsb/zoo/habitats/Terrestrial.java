package com.cdsb.zoo.habitats;

import com.cdsb.zoo.enums.HabitatType;

public class Terrestrial extends Habitats{

    public Terrestrial(String habitatName) {
        super(habitatName);
        habitatType = HabitatType.TERRESTRIAL;
    }

    @Override
    public HabitatType getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(HabitatType habitatType) {
        this.habitatType = habitatType;
    }
}
