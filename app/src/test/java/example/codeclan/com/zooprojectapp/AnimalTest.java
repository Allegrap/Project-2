package example.codeclan.com.zooprojectapp;

import org.junit.Before;

/**
 * Created by user on 23/04/2017.
 */

public class AnimalTest {

    Animal animal;

    @Before
    public void before(){
        animal = new Animal("Bertie", "rhino", 'm', false, "adult");
    }

    
}
