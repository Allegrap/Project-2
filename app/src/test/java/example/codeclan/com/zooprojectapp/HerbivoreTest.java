package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class HerbivoreTest {

    Herbivore herbivore;
    Food meat;
    Food vegetables;
    Food grass;
    Food fruit;

    @Before
    public void before(){
        herbivore = new Herbivore("Tony", "turtle", 'm', "adult");
        meat = new Food(FoodType.MEAT, 9);
        vegetables = new Food(FoodType.VEGETABLES, 4);
        grass = new Food(FoodType.GRASS, 3);
        fruit = new Food(FoodType.FRUIT, 5);
    }

    @Test
    public void canEatVegetablesTest(){
        herbivore.eat(vegetables);
        assertEquals(1, herbivore.getBellySize());
    }

    @Test
    public void canEatGrassTest(){
        herbivore.eat(vegetables);
        assertEquals(1, herbivore.getBellySize());
    }

    @Test
    public void canEatFruitTest(){
        herbivore.eat(fruit);
        assertEquals(1, herbivore.getBellySize());
    }

    @Test
    public void cannotEatMeatTest(){
        herbivore.eat(meat);
        assertEquals(0, herbivore.getBellySize());
    }

}
