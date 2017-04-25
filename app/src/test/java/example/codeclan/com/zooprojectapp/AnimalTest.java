package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.animals.Carnivore;
import example.codeclan.com.zooprojectapp.animals.Herbivore;
import example.codeclan.com.zooprojectapp.animals.Hippo;
import example.codeclan.com.zooprojectapp.animals.Leopard;
import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/04/2017.
 */

public class AnimalTest {

    Hippo hippo;
    Leopard leopard;
    Food foodVeg;
    Food foodVeg2;
    Food foodMeat;

    @Before
    public void before(){
        hippo = new Hippo("Bertie", 'm', "adult");
        leopard = new Leopard("Darren", 'm', "baby");
        foodVeg = new Food(FoodType.GRASS, 4);
        foodVeg2 = new Food(FoodType.VEGETABLES, 6);
        foodMeat = new Food(FoodType.MEAT, 9);
    }

    @Test
    public void getNameTest(){
        assertEquals("Bertie", hippo.getName());
    }


    @Test
    public void getGenderTest(){
        assertEquals('m', hippo.getGender());
    }

    @Test
    public void getMaturityTest(){
        assertEquals("adult", hippo.getMaturity());
    }

    @Test
    public void canGetBellySizeTest(){
        assertEquals(0, hippo.getBellySize());
    }

    @Test
    public void canEatTest(){
        hippo.eat(foodVeg);
        assertEquals(1, hippo.getBellySize());
    }

    @Test
    public void bellyEmptiesAfterSleepTest(){
        hippo.eat(foodVeg);
        hippo.sleep();
        assertEquals(0, hippo.getBellySize());
    }

    @Test
    public void getNutritionalValueOfBellyTest(){
        hippo.eat(foodVeg);
        hippo.eat(foodVeg2);
        assertEquals(10, hippo.totalNutrition());
    }

}
