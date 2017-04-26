package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

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
    Food grass;
    Food vegetables;
    Food meat;

    @Before
    public void before(){
        hippo = new Hippo("Bertie", 'm', "adult", "grassland", 100, 1000);
        leopard = new Leopard("Darren", 'm', "baby", "rainforest", 50, 700);
        grass = new Food(FoodType.GRASS, 4, 5);
        vegetables = new Food(FoodType.VEGETABLES, 6, 10);
        meat = new Food(FoodType.MEAT, 9, 20);
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
    public void getPriceTest(){
        assertEquals(1000, hippo.getPrice());
    }

    @Test
    public void getBiomeTest(){
        assertEquals("grassland", hippo.getBiome());
    }

    @Test
    public void getHungerTest(){
        assertEquals(100, hippo.getHunger());
    }

    @Test
    public void getBellySizeTest(){
        assertEquals(0, hippo.getBellySize());
    }

    @Test
    public void canEatTest(){
        hippo.eat(grass);
        assertEquals(1, hippo.getBellySize());
        assertEquals(96, hippo.getHunger());
    }

    @Test
    public void bellyEmptiesAfterSleepTest(){
        hippo.eat(grass);
        hippo.sleep();
        assertEquals(0, hippo.getBellySize());
    }

    @Test
    public void getNutritionalValueOfBellyTest(){
        hippo.eat(grass);
        hippo.eat(vegetables);
        assertEquals(10, hippo.totalNutrition());
    }

    @Test
    public void animalCanPlayTest(){
        assertEquals("I am playing!", hippo.play());
    }
}
