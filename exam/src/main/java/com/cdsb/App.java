package com.cdsb;


import com.cdsb.zoo.species.IAnimals;
import com.cdsb.zoo.species.mammals.Elephants;
import com.cdsb.zoo.species.mammals.Lions;
import com.cdsb.zoo.species.mammals.Zebras;
import com.cdsb.zoo.species.reptiles.Iguanas;
import com.cdsb.zoo.species.reptiles.Snakes;

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

        IAnimals zebra1 = new Zebras("Marshal");
        System.out.println(zebra1.getNameOfTheAnimal());
        System.out.println(zebra1.canLiveTogether(elephant1));
        System.out.println(zebra1.toString());

        IAnimals snake1 = new Snakes("Nagini");
        System.out.println(snake1.getNameOfTheAnimal());
        System.out.println(snake1.getAnimalSpecies());
        System.out.println(snake1.canLiveTogether(lion1));

        IAnimals iguana1 = new Iguanas("Ana");
        System.out.println(iguana1.getNameOfTheAnimal());
        System.out.println(iguana1.canLiveTogether(iguana1));
    }
}
