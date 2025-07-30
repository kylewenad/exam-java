package com.cdsb.zoo.habitats;

import java.util.Set;

import com.cdsb.zoo.enums.HabitatType;
import com.cdsb.zoo.species.IAnimals;

public interface IHabitats {

    String getHabitatName();

    HabitatType getHabitatType();
    
    boolean isCompatibleHabitatType();
    Set<IAnimals> getAnimals();

}
