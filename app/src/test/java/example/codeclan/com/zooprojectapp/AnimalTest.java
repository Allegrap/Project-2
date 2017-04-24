package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/04/2017.
 */

public class AnimalTest {

    Herbivore herbivore;
    Carnivore carnivore;

    @Before
    public void before(){
        herbivore = new Herbivore("Bertie", "rhino", 'm', "adult");
        carnivore = new Carnivore("Darren", "leopard", 'm', "baby");
    }

    @Test
    public void getName(){
        assertEquals("Bertie", herbivore.getName());
    }

    @Test
    public void getType(){
        assertEquals("leopard", carnivore.getType());
    }

    @Test
    public void getGender(){
        assertEquals('m', herbivore.getGender());
    }

    @Test
    public void getMaturity(){
        assertEquals("adult", herbivore.getMaturity());
    }
}
