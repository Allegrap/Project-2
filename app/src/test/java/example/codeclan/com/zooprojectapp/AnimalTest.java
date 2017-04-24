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
    Food foodVeg;
    Food foodVeg2;
    Food foodMeat;

    @Before
    public void before(){
        herbivore = new Herbivore("Bertie", "rhino", 'm', "adult");
        carnivore = new Carnivore("Darren", "leopard", 'm', "baby");
        foodVeg = new Food(FoodType.GRASS, 4);
        foodVeg2 = new Food(FoodType.VEGETABLES, 6);
        foodMeat = new Food(FoodType.MEAT, 9);
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
        herbivore.eat(foodVeg);
        assertEquals(1, herbivore.getBellySize());
    }

    @Test
    public void bellyEmptiesAfterSleepTest(){
        herbivore.eat(foodVeg);
        herbivore.sleep();
        assertEquals(0, herbivore.getBellySize());
    }

    @Test
    public void getNutritionalValueOfBellyTest(){

    }

}
