package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class EnclosureTest {

    Enclosure enclosure;
    Animal animal;

    @Before
    public void before(){
        enclosure = new Enclosure();
        animal = new Animal("Bertie", "rhino", 'm', false, "adult");
    }

    @Test
    public void addAnimalTest(){
        enclosure.addAnimal(animal);
        assertEquals(1, enclosure.numberOfAnimals());
    }

}
