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
    
    
    public Mammals(String nameOfAnimal, Specie species) {
        super(nameOfAnimal);
        species = Specie.MAMMALS;
        compatible = new HashSet<>();
        incompatible = new HashSet<>();
        incompatible.add(Specie.AQUATIC_ANIMALS);
        incompatible.add(Specie.REPTILES);
        incompatible.add(Specie.BIRDS);
    }
    
    @Override
    public Specie getSpecies() {
        return Specie.MAMMALS;
    }
    public void setSpecies(Specie species) {
        this.species = species;
    }

    @Override
    public Boolean isCompatible(ISpecies Species) {
        boolean compatible = true;
        if(!species.equals(species.getSpecies())){
            if(!compatible.contains(mammals.getSpecies())){
                compatible &= !animals.equals(Species);
                compatible &= !species.contains
            }
        }

        return compatible;
    }


    
    
}
