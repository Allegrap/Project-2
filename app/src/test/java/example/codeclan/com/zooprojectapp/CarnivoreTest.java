package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.animals.Carnivore;
import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class CarnivoreTest {

    Carnivore carnivore;
    Food meat;
    Food vegetables;
    Food grass;
    Food fruit;
    Food fish;

    @Before
    public void before(){
        carnivore = new Carnivore("Angela", "lion", 'f', "adult");
        meat = new Food(FoodType.MEAT, 9);
        fish = new Food(FoodType.FISH, 8);
        vegetables = new Food(FoodType.VEGETABLES, 4);
        grass = new Food(FoodType.GRASS, 3);
        fruit = new Food(FoodType.FRUIT, 5);
    }

    @Test
    public void canEatMeatTest(){
        carnivore.eat(meat);
        assertEquals(1, carnivore.getBellySize());
    }

    @Test
    public void canEatFishTest(){
        carnivore.eat(fish);
        assertEquals(1, carnivore.getBellySize());
    }

    @Test
    public void canEatGrassTest(){
        carnivore.eat(grass);
        assertEquals(1, carnivore.getBellySize());
    }

    @Test
    public void cannotEatVegetablesTest(){
        carnivore.eat(vegetables);
        assertEquals(0, carnivore.getBellySize());
    }

    @Test
    public void cannotEatFruitTest(){
        carnivore.eat(fruit);
        assertEquals(0, carnivore.getBellySize());
    }

}
