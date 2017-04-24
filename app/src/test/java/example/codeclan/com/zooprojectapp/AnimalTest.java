package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/04/2017.
 */

public class AnimalTest {

    Herbivore herbivore;
    Carnivore carnivore;
    Food food;

    @Before
    public void before(){
        herbivore = new Herbivore("Bertie", "rhino", 'm', "adult");
        carnivore = new Carnivore("Darren", "leopard", 'm', "baby");
        food = new Food(FoodType.GRASS, 4);
    }

    @Test
    public void getNameTest(){
        assertEquals("Bertie", herbivore.getName());
    }

    @Test
    public void getTypeTest(){
        assertEquals("leopard", carnivore.getType());
    }

    @Test
    public void getGenderTest(){
        assertEquals('m', herbivore.getGender());
    }

    @Test
    public void getMaturityTest(){
        assertEquals("adult", herbivore.getMaturity());
    }

    @Test
    public void canGetBellySize(){
        assertEquals(0, herbivore.getBellySize());
    }

    @Test
    public void canEatTest(){
        herbivore.eat(food);
        assertEquals(1, herbivore.getBellySize());
    }

}
