package com.cdsb.zoo;

import com.cdsb.zoo.habitats.IHabitats;
import com.cdsb.zoo.species.IAnimals;

public interface IZoo {

    String getZooName();

    void addAnimal(IAnimals animals);
    void removeAnimal(IAnimals animals);

    void addHabitat(IHabitats habitats);
    void removeHabitat(IHabitats habitats);

}
