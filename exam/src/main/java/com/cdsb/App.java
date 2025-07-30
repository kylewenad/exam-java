package com.cdsb;


import com.cdsb.zoo.species.IAnimals;
import com.cdsb.zoo.species.mammals.Elephants;
import com.cdsb.zoo.species.mammals.Lions;

public final class App {
   
    public static void main(String[] args) {
        IAnimals lion1 = new Lions("Simba");
        System.out.println(lion1.getNameOfTheAnimal());
        System.out.println(lion1.getAnimalSpecies());
        System.out.println(lion1.getAnimalType());
    

        IAnimals lion2 = new Lions("Nala");
        System.out.println(lion1.canLiveTogether(lion2));

        IAnimals elephant1 = new Elephants("Dumbo");
        System.out.println(elephant1.getNameOfTheAnimal());
        System.out.println(elephant1.canLiveTogether(lion1));
        System.out.println(elephant1.toString());
    }
}
