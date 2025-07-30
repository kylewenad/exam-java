package com.cdsb.zoo;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.habitats.Habitats;
import com.cdsb.zoo.habitats.IHabitats;
import com.cdsb.zoo.species.Animals;
import com.cdsb.zoo.species.IAnimals;

public class Zoo implements IZoo{

    private String name;
    private Set<Habitats> habitatList;
    protected Set<IAnimals> animalList;

    public Zoo(String name) {
        this.name = name;
        habitatList = new HashSet<>();
        animalList = new HashSet<>();
    }
    
    @Override
    public String zooName() {
        return name;
    }
    
    @Override
    public void addHabitat(IHabitats habitats) {
        habitatList.add(habitats);
    }

    @Override
    public void removeHabitat(IHabitats habitats) {
        habitatList.remove(habitats);
    }

    @Override
    public void addAnimal(IAnimals animals) {
        animalList.add(animals);
    }

    @Override
    public void removeAnimal(IAnimals animals) {
        animalList.remove(animals);
    }



}
