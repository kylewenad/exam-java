package com.cdsb.zoo.species.mammals;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.Species;
import com.cdsb.zoo.enums.Animals;
import com.cdsb.zoo.enums.Specie;
import com.cdsb.zoo.species.ISpecies;

public abstract class Mammals extends Species{
    
    protected Set<Specie> compatible;
    protected Set<Specie> incompatible;
    
    protected Specie species;
    protected Animals animals;
    
    
    public Mammals(String nameOfTheAnimal, Specie species) {
        super(nameOfTheAnimal);
        species = Specie.MAMMALS;
        compatible = new HashSet<>();
        incompatible = new HashSet<>();
        incompatible.add(Specie.AQUATIC_ANIMALS);
        incompatible.add(Specie.REPTILES);
        incompatible.add(Specie.BIRDS); 
    }
    
    public void setSpecie(Specie species) {
        this.species = species;
    }
    
    @Override
    public Specie getSpecie() {
        return Specie.MAMMALS;
    }

    @Override
    public Boolean isCompatible(ISpecies species) {
        boolean compatible = true;
        if(!Specie.equals(getSpecie())) {
            if(!
        }

        return compatible;
    }
    
}
