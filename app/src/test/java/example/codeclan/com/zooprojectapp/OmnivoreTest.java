package example.codeclan.com.zooprojectapp;

import org.junit.Before;

import example.codeclan.com.zooprojectapp.animals.BeardedDragon;

/**
 * Created by user on 26/04/2017.
 */

public class OmnivoreTest {

    BeardedDragon beardedDragon;

    @Before
    public void before(){
        beardedDragon = new BeardedDragon("Tyrone", 'f', "adult");
    }

}
