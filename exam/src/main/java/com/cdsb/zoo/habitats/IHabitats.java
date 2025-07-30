package com.cdsb.zoo.habitats;

import com.cdsb.zoo.enums.HabitatType;

public interface IHabitats {

    String getHabitatName();

    HabitatType getHabitatType();
    
    boolean isCompatibleHabitatType();

}
