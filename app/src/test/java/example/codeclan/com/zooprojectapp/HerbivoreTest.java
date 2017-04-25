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

    @Before
    public void before(){
        herbivore = new Herbivore("Tony", "turtle", 'm', "adult");
        meat = new Food(FoodType.MEAT, 9);
        vegetables = new Food(FoodType.VEGETABLES, 4);
    }

    @Test
    public void canEatGrass(){
        herbivore.eat(vegetables);
        assertEquals(0, herbivore.getBellySize());
    }

    @Test
    public void cannotEatMeat(){
        herbivore.eat(meat);
        assertEquals(1, herbivore.getBellySize());
    }

}
