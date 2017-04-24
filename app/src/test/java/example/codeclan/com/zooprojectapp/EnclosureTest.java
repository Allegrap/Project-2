package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class EnclosureTest {

    Enclosure enclosure;
    Animal animal1;
    Animal animal2;

    @Before
    public void before(){
        enclosure = new Enclosure();
        animal1 = new Animal("Bertie", "rhino", 'm', false, "adult");
        animal2 = new Animal("Banana", "hippo", 'f', false, "baby");
    }

    @Test
    public void addAnimalTest(){
        enclosure.addAnimal(animal1);
        assertEquals(1, enclosure.numberOfAnimals());
    }

    @Test
    public void canGetAnimalsList(){
        enclosure.addAnimal(animal1);
        enclosure.addAnimal(animal2);
        assertEquals(2, enclosure.getAnimals().size());
    }

}
