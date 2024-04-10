package org.learning;

public class Main {
    public static void main(String[] args) {
        Animal[] myAnimals = new Animal[2];
        myAnimals[0] = new Animal(13, "John", AnimalSpecies.DOG);
        myAnimals[1] = new Animal(17, "Jane", AnimalSpecies.CAT);
        Zoo baltimoreZoo = new Zoo(myAnimals);
        baltimoreZoo.newAnimal();
        myAnimals = baltimoreZoo.getAnimals();
        for (Animal animal : myAnimals) {
            System.out.println(animal.getName());
        }
    }
}