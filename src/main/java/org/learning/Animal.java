package org.learning;

public class Animal {
    private String name;
    private AnimalSpecies species;
    private int age;
    private static int nextId = 1;
    private int id;

    // Regular constructor
    public Animal(int startingAge, String birthName, AnimalSpecies type) {
        this.id = nextId++;
        this.name = birthName;
        this.age = startingAge;
        this.species = type;
    }

    // Copy constructor
    public Animal(Animal a) {
        this(a.age, a.name, a.species);
    }

    public String getName() {
        return this.name;
    }

    public AnimalSpecies getSpecies() {
        return this.species;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return id;
    }

    public void setName(String newName) {
        this.name = newName;
    }


    public void setAge(int newAge) {
        this.age = newAge;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animal other = (Animal) obj;
        return this.age == other.age && this.species == other.species;
    }

    @Override
    public String toString() {
        return "Animal [id=" + id + ", name=" + name + ", species=" + species + ", age=" + age + "]";
    }
}
