package example.codeclan.com.zooprojectapp;

import org.junit.Before;

import example.codeclan.com.zooprojectapp.food_management.FoodType;
import example.codeclan.com.zooprojectapp.food_management.Stray;

/**
 * Created by user on 25/04/2017.
 */

public class StrayTest {

    Stray stray;

    @Before
    public void before(){
        stray = new Stray("dog", FoodType.MEAT, 30);
    }
    

}
