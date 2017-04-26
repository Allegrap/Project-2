package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.animals.BeardedDragon;
import example.codeclan.com.zooprojectapp.animals.Leopard;
import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 26/04/2017.
 */

public class OmnivoreTest {

    BeardedDragon beardedDragon;
    Food meat;
    Food vegetables;
    Food grass;
    Food fruit;
    Food fish;
    Food insects;

    @Before
    public void before(){
        beardedDragon = new BeardedDragon("Tyrone", 'f', "adult");
        meat = new Food(FoodType.MEAT, 9);
        fish = new Food(FoodType.FISH, 8);
        vegetables = new Food(FoodType.VEGETABLES, 4);
        grass = new Food(FoodType.GRASS, 3);
        fruit = new Food(FoodType.FRUIT, 5);
        insects = new Food(FoodType.INSECTS, 2);
    }

    @Test
    public void canEatInsects(){
        beardedDragon.eat(insects);
        assertEquals(1, beardedDragon.getBellySize());
    }

    @Test
    public void canEatVegetables(){
        beardedDragon.eat(vegetables);
        assertEquals(1, beardedDragon.getBellySize());
    }

    @Test
    public void canEatGrassTest(){
        beardedDragon.eat(grass);
        assertEquals(1, beardedDragon.getBellySize());
    }

    @Test
    public void cannotEatFruitTest(){
        beardedDragon.eat(fruit);
        assertEquals(0, beardedDragon.getBellySize());
    }

    @Test
    public void cannotEatFishTest(){
        beardedDragon.eat(fish);
        assertEquals(0, beardedDragon.getBellySize());
    }

    @Test
    public void cannotEatMeatTest(){
        beardedDragon.eat(meat);
        assertEquals(0, beardedDragon.getBellySize());
    }

}
