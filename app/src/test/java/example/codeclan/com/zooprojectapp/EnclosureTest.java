package example.codeclan.com.zooprojectapp;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class EnclosureTest {

    @Test
    public void addAnimalTest(){
        Enclosure.addAnimal("Bertie", "rhino", 'm', false, "adult");
        assertEquals(1, Enclosure.numberOfAnimals());
    }

}
