package com.cdsb.zoo.species.mammals;

import java.util.HashSet;
import java.util.Set;

import com.cdsb.zoo.enums.Animals;
import com.cdsb.zoo.enums.Species;
import com.cdsb.zoo.species.ISpecies;

public abstract class Mammals implements ISpecies{

    protected Species species;
    protected Animals animals;
    protected Set<Species> compatible;
    protected Set<Species> incompatible;
    
    private String nameOfAnimal;
    private int space;
    
    
    public Mammals(String nameOfAnimal, Species species, Set<Species> compatible, Set<Species> incompatible) {
        this.nameOfAnimal = nameOfAnimal;
        species = Species.MAMMALS;
        compatible = new HashSet<>();
        incompatible = new HashSet<>();
    }
    
    @Override
    public String getNameOfTheAnimal() {
        return nameOfAnimal;
    }

    @Override
    public Species getSpecies() {
        return Species.MAMMALS;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public Boolean isCompatible() {
        boolean compatible = true;
        if(!Species.equals(Mammals.compatible())){
            
        }

        }
        return false;
    }


    
    
}
