package org.learning;

public class Animal {
    private String name;
    // TODO: maybe make this an enum? Not sure yet.
    private String species;
    // TODO: decide whether we include months as part of an age, if so, this will need to be a double or float, depending on how accurate it should be
    private int age;

    // Regular
    Animal(int startingAge, String birthName, String type) {
        this.name = birthName;
        this.age = startingAge;
        this.species = type;
    }

    // Carbon Copy
    Animal(Animal a) {
        this.name = a.name;
        this.age = a.age;
        this.species = a.species;
    }
    // get
    public String getName() {
        return this.name;
    }

    public String getSpecies(){
        return this.species;
    }

    public int getAge(){
        return this.age;
    }

    public Boolean equals(Animal a){
        return (a.getAge() == this.getAge()) && (a.getSpecies().equals(this.getSpecies()));
    }
    // TODO: Remove debug function in prod
    public String toString(){
        return "name: " + getName() + "age: " + getAge() + "species:" + getSpecies();
    }
    // set
    public void setName(String newName){
        this.name = newName;
    }
    //// RESOLVED: Decide whether this should be mutable, species should (usually) be constant.
    // public void setSpecies(String newSpecies){
    //     species=newSpecies;
    // }
    public void setAge(int newAge){
        this.age=newAge;
    }
}
