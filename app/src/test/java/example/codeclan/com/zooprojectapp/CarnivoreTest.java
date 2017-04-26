package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.animals.Leopard;
import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class CarnivoreTest {

    Leopard leopard;
    Food meat;
    Food vegetables;
    Food grass;
    Food fruit;
    Food fish;
    Food insects;

    @Before
    public void before(){
        leopard = new Leopard("Angela", 'f', "adult");
        meat = new Food(FoodType.MEAT, 9, 20);
        fish = new Food(FoodType.FISH, 8, 15);
        vegetables = new Food(FoodType.VEGETABLES, 4, 10);
        grass = new Food(FoodType.GRASS, 3, 5);
        fruit = new Food(FoodType.FRUIT, 5, 6);
        insects = new Food(FoodType.INSECTS, 2, 3);
    }

    @Test
    public void canEatMeatTest(){
        leopard.eat(meat);
        assertEquals(1, leopard.getBellySize());
    }

    @Test
    public void canEatFishTest(){
        leopard.eat(fish);
        assertEquals(1, leopard.getBellySize());
    }

    @Test
    public void canEatGrassTest(){
        leopard.eat(grass);
        assertEquals(1, leopard.getBellySize());
    }

    @Test
    public void canEatInsects(){
        leopard.eat(insects);
        assertEquals(1, leopard.getBellySize());
    }

    @Test
    public void cannotEatVegetablesTest(){
        leopard.eat(vegetables);
        assertEquals(0, leopard.getBellySize());
    }

    @Test
    public void cannotEatFruitTest(){
        leopard.eat(fruit);
        assertEquals(0, leopard.getBellySize());
    }

}
