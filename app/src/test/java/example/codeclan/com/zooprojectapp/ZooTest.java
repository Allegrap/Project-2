package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.animals.Carnivore;
import example.codeclan.com.zooprojectapp.animals.Herbivore;
import example.codeclan.com.zooprojectapp.zoo_management.Visitor;
import example.codeclan.com.zooprojectapp.zoo_management.Zoo;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class ZooTest {

    Zoo zoo;
    Herbivore herbivore;
    Carnivore carnivore;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before(){
        zoo = new Zoo(20);
        herbivore = new Herbivore("Bertie", "rhino", 'm', "adult");
        carnivore = new Carnivore("Darren", "leopard", 'm', "baby");
        visitor = new Visitor("Allegra", 400);
        visitor2 = new Visitor("Chiara", 10);
    }

    @Test
    public void canGetEntryFeeTest(){
        assertEquals(20, zoo.getEntryFee());
    }



}
