package example.codeclan.com.zooprojectapp;

import org.junit.Before;

/**
 * Created by user on 24/04/2017.
 */

public class FoodTest {

    Food food;

    @Before
    public void before(){
        food = new Food(FoodType.MEAT, 9);
    }

}
