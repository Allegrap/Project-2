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
    public void getFoodTypeTest(){
        assertEquals(FoodType.MEAT, meat.getFoodType());
    }

    @Test
    public void getNutritionalValueTest(){
        assertEquals(9, meat.getNutritionalValue());
    }

    @Test
    public void getPriceTest(){ assertEquals(20, meat.getPrice()); }

    @Test
    public void setNutritionalValueTest(){
        meat.setNutritionalValue(12);
        assertEquals(12, meat.getNutritionalValue());
    }

    @Test
    public void setPriceTest(){
        meat.setPrice(30);
        assertEquals(30, meat.getPrice());
    }

}
