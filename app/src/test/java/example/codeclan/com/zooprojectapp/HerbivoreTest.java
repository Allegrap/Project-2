package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.animals.Hippo;
import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class HerbivoreTest {

    Hippo hippo;
    Food meat;
    Food vegetables;
    Food grass;
    Food fruit;

    @Before
    public void before(){
        hippo = new Hippo("Tony", 'm', "adult");
        meat = new Food(FoodType.MEAT, 9, 20);
        vegetables = new Food(FoodType.VEGETABLES, 4, 10);
        grass = new Food(FoodType.GRASS, 3, 5);
        fruit = new Food(FoodType.FRUIT, 5, 6);
    }

    @Test
    public void canEatVegetablesTest(){
        hippo.eat(vegetables);
        assertEquals(1, hippo.getBellySize());
    }

    @Test
    public void canEatGrassTest(){
        hippo.eat(vegetables);
        assertEquals(1, hippo.getBellySize());
    }

    @Test
    public void canEatFruitTest(){
        hippo.eat(fruit);
        assertEquals(1, hippo.getBellySize());
    }

    @Test
    public void cannotEatMeatTest(){
        hippo.eat(meat);
        assertEquals(0, hippo.getBellySize());
    }

}
