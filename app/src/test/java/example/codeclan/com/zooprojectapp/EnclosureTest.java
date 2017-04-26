package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.animals.Hippo;
import example.codeclan.com.zooprojectapp.animals.Hyena;
import example.codeclan.com.zooprojectapp.animals.Leopard;
import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.food_management.FoodType;
import example.codeclan.com.zooprojectapp.zoo_management.Enclosure;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class EnclosureTest {

    Enclosure enclosure;
    Hippo hippo;
    Leopard leopard;
    Hyena hyena;
    Food meat;
    Food vegetables;

    @Before
    public void before(){
        enclosure = new Enclosure("Africa", "grassland");
        hippo = new Hippo("Bertie", 'm', "adult", "grassland", 100, 900);
        leopard = new Leopard("Darren", 'm', "baby", "rainforest", 50, 700);
        hyena = new Hyena("Chuckles", 'm', "adult", "grassland", 40, 600);
        meat = new Food(FoodType.MEAT, 9, 20);
        vegetables = new Food(FoodType.VEGETABLES, 4, 10);
    }

    @Test
    public void canCountAnimals(){
        assertEquals(0, enclosure.numberOfAnimals());
    }

    @Test
    public void addAnimalTest(){
        enclosure.addAnimal(hippo);
        assertEquals(1, enclosure.numberOfAnimals());
    }

    @Test
    public void getAnimalsListTest(){
        enclosure.addAnimal(hippo);
        enclosure.addAnimal(hyena);
        assertEquals(2, enclosure.getAnimals().size());
    }

    @Test
    public void cannotAddAnimalWithDifferentBiomeTest(){
        enclosure.addAnimal(hippo);
        enclosure.addAnimal(leopard);
        assertEquals(1, enclosure.getAnimals().size());
    }

    @Test
    public void canCountFood(){
        assertEquals(0, enclosure.numberOfFood());
    }

    @Test
    public void canAddFood(){
        enclosure.addFood(meat);
        enclosure.addFood(vegetables);
        assertEquals(2, enclosure.numberOfFood());
    }

    @Test
    public void getFoodListTest(){
        enclosure.addFood(meat);
        enclosure.addFood(vegetables);
        assertEquals(2, enclosure.getFood().size());
    }

    @Test
    public void canFeedAnimalsTest(){
        enclosure.addAnimal(hippo);
        Food food = new Food(FoodType.VEGETABLES, 5, 10);
        enclosure.feedAnimal(hippo, food);
        assertEquals(1, hippo.getBellySize());
    }

}
