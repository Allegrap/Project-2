package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class EnclosureTest {

    Enclosure enclosure;
    Herbivore herbivore;
    Carnivore carnivore;

    @Before
    public void before(){
        enclosure = new Enclosure();
        herbivore = new Herbivore("Bertie", "rhino", 'm', "adult");
        carnivore = new Carnivore("Darren", "leopard", 'm', "baby");
    }

    @Test
    public void addAnimalTest(){
        enclosure.addAnimal(herbivore);
        assertEquals(1, enclosure.numberOfAnimals());
    }

    @Test
    public void getAnimalsListTest(){
        enclosure.addAnimal(herbivore);
        enclosure.addAnimal(carnivore);
        assertEquals(2, enclosure.getAnimals().size());
    }

}
