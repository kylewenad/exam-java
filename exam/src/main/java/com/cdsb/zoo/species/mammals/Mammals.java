package com.cdsb.zoo.species.mammals;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.enums.AnimalSpecies;
import com.cdsb.zoo.enums.AnimalType;
import com.cdsb.zoo.species.Species;


public abstract class Mammals extends Species{
    
    protected Set<AnimalType> compatible;
    protected Set<AnimalType> incompatible;
    protected AnimalSpecies animalSpecies;
    
    public Mammals(String nameOfTheAnimal) {
        super(nameOfTheAnimal);
        animalSpecies = AnimalSpecies.MAMMALS;
        compatible = new HashSet<>();
        incompatible = new HashSet<>();        
    }
    
    public void setSpecies(AnimalSpecies animalSpecies) {
        this.animalSpecies = animalSpecies;
    }
    
    @Override
    public AnimalSpecies getAnimalSpecies() {
        return animalSpecies;
    }
}
