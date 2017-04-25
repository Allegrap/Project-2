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

    Food food;

    @Before
    public void before(){
        food = new Food(FoodType.MEAT, 9);
    }

    @Test
    public void canGetFoodTypeTest(){
        assertEquals(FoodType.MEAT, food.getFoodType());
    }

    @Test
    public void canGetNutritionalValueTest(){
        assertEquals(9, food.getNutritionalValue());
    }

}
