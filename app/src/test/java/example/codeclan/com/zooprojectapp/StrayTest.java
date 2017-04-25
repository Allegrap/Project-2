package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.food_management.FoodType;
import example.codeclan.com.zooprojectapp.food_management.Stray;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class StrayTest {

    Stray stray;

    @Before
    public void before(){
        stray = new Stray("dog", FoodType.MEAT, 30);
    }

    @Test
    public void canGetTypeTest(){
        assertEquals("dog", stray.getType());
    }



}
