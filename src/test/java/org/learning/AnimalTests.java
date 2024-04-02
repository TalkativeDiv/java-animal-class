package org.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTests {

    @Test
    void testRegularConstructor() {
        Animal animal = new Animal(5, "Fluffy", "Cat");
        assertEquals("Fluffy", animal.getName());
        assertEquals("Cat", animal.getSpecies());
        assertEquals(5, animal.getAge());
    }

    @Test
    void testCopyConstructor() {
        Animal original = new Animal(3, "Rex", "Dog");
        Animal copy = new Animal(original);
        assertEquals(original.getName(), copy.getName());
        assertEquals(original.getSpecies(), copy.getSpecies());
        assertEquals(original.getAge(), copy.getAge());
    }

    @Test
    void testSetName() {
        Animal animal = new Animal(2, "Buddy", "Dog");
        animal.setName("Max");
        assertEquals("Max", animal.getName());
    }

    // @Test
    // void testSetSpecies() {
    //     Animal animal = new Animal(1, "Whiskers", "Cat");
    //     animal.setSpecies("Lion");
    //     assertEquals("Lion", animal.getSpecies());
    // }

    @Test
    void testSetAge() {
        Animal animal = new Animal(4, "Mittens", "Cat");
        animal.setAge(6);
        assertEquals(6, animal.getAge());
    }

    @Test
    void testEquals() {
        Animal animal1 = new Animal(3, "Spot", "Dog");
        Animal animal2 = new Animal(3, "Spot", "Dog");
        Animal animal3 = new Animal(5, "Spot", "Dog");

        assertTrue(animal1.equals(animal2));
        assertFalse(animal1.equals(animal3));
    }
}
