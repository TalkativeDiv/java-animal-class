package org.learning;
import java.util.Arrays;
import java.util.Random;

public class Zoo {
    private Animal[] animals;
    private static final String[] names = {"Max", "Bella", "Charlie", "Lucy", "Jack", "Luna", "Cooper", "Daisy", "Buddy", "Lola", "Rocky", "Sadie", "Toby", "Molly", "Bailey", "Sophie", "Duke", "Chloe", "Bear", "Zoe"};

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    public void newAnimal() {
        Animal[] animalsCopy = Arrays.copyOf(animals, animals.length + 1);
        String randomName = names[new Random().nextInt(names.length)];
        AnimalSpecies randomSpecies = AnimalSpecies.values()[new Random().nextInt(AnimalSpecies.values().length)];
        animalsCopy[animalsCopy.length - 1] = new Animal(new Random().nextInt(12), randomName, randomSpecies);
        animals = animalsCopy;
    }

    public Animal[] getAnimals() {
        return animals;
    }
}
