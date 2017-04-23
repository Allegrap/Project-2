package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/04/2017.
 */

public class AnimalTest {

    Animal animal;

    @Before
    public void before(){
        animal = new Animal("Bertie", "rhino", 'm', false, "adult");
    }

    @Test
    public void getName(){
        assertEquals("Bertie", animal.getName());
    }

    @Test
    public void getType(){
        assertEquals("rhino", animal.getType());
    }

    @Test
    public void getGender(){
        assertEquals('m', animal.getGender());
    }
}
