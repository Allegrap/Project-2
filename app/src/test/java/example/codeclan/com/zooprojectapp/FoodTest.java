package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class FoodTest {

    Food meat;

    @Before
    public void before(){
        meat = new Food(FoodType.MEAT, 9, 20);
    }

    @Test
    public void canGetFoodTypeTest(){
        assertEquals(FoodType.MEAT, meat.getFoodType());
    }

    @Test
    public void canGetNutritionalValueTest(){
        assertEquals(9, meat.getNutritionalValue());
    }

    @Test
    public void canGetPriceTest(){
        assertEquals(20, meat.getPrice());
    }

}
