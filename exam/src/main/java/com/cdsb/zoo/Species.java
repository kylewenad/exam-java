package com.cdsb.zoo;

import java.util.Set;

import com.cdsb.zoo.enums.Animals;
import com.cdsb.zoo.enums.Habitats;
import com.cdsb.zoo.species.ISpecies;

public abstract class Species implements ISpecies{

    protected Set<Species> compatible;
    protected Set<Species> incompatible;

    protected Species species;
    protected Animals animals;
    protected Habitats habitats;
    private String nameOfTheAnimal;
    
    
    public Species(String nameOfTheAnimal) {
        this.nameOfTheAnimal = nameOfTheAnimal;
    }

    @Override
    public String getNameOfTheAnimal() {
        return nameOfTheAnimal;
    }

    public void setNameOfTheAnimal(String nameOfTheAnimal){
        this.nameOfTheAnimal = nameOfTheAnimal;
    }

}
