package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class CarnivoreTest {

    Carnivore carnivore;
    Food meat;
    Food vegetables;

    @Before
    public void before(){
        carnivore = new Carnivore("Angela", "lion", 'f', "adult");
        meat = new Food(FoodType.MEAT, 9);
        vegetables = new Food(FoodType.VEGETABLES, 4);
    }

    @Test
    public void canEatMeat(){
        carnivore.eat(meat);
        assertEquals(1, carnivore.getBellySize());
    }

    @Test
    public void cannotEatGrass(){
        carnivore.eat(vegetables);
        assertEquals(0, carnivore.getBellySize());
    }

}