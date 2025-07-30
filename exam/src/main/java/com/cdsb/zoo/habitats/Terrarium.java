package com.cdsb.zoo.habitats;

import com.cdsb.zoo.enums.HabitatType;

public class Terrarium extends Habitats {

    public Terrarium(String habitatName) {
        super(habitatName);
        habitatType = HabitatType.TERRARIUM;
    }

    @Override
    public HabitatType getHabitatType() {
        return habitatType;
    }

    public void setHabitatType(HabitatType habitatType) {
        this.habitatType = habitatType;
    }

}
