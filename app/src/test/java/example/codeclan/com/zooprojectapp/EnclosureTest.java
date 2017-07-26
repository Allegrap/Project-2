package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.animals.Hippo;
import example.codeclan.com.zooprojectapp.animals.Hyena;
import example.codeclan.com.zooprojectapp.animals.Leopard;
import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.food_management.FoodType;
import example.codeclan.com.zooprojectapp.zoo_management.Enclosure;
import example.codeclan.com.zooprojectapp.zoo_management.Zoo;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 24/04/2017.
 */

public class EnclosureTest {

    Zoo zoo;
    Enclosure enclosure;
    Hippo hippo;
    Leopard leopard;
    Hyena hyena;
    Food meat;
    Food vegetables;

    @Before
    public void before(){
        zoo = new Zoo(20, 5000, 2);
        enclosure = new Enclosure("Africa", "grassland");
        hippo = new Hippo("Bertie", 'm', "adult", "grassland", 100, 900);
        leopard = new Leopard("Darren", 'm', "baby", "rainforest", 50, 700);
        hyena = new Hyena("Chuckles", 'm', "adult", "grassland", 40, 600);
        meat = new Food(FoodType.MEAT, 9, 20);
        vegetables = new Food(FoodType.VEGETABLES, 4, 10);
    }

    @Test
    public void getNameTest(){
        assertEquals("Africa", enclosure.getName());
    }

    @Test
    public void getBiomeTest(){
        assertEquals("grassland", enclosure.getBiome());
    }

    @Test
    public void getAnimalsListTest(){
        zoo.addAnimalToEnclosure(hippo, enclosure);
        zoo.addAnimalToEnclosure(hyena, enclosure);
        assertEquals(2, enclosure.getAnimals().size());
    }

    @Test
    public void getFoodListTest(){
        enclosure.acceptFood(meat);
        enclosure.acceptFood(vegetables);
        assertEquals(2, enclosure.getFood().size());
    }

    @Test
    public void setNameTest(){
        enclosure.setName("jungle");
        assertEquals("jungle", enclosure.getName());
    }

    @Test
    public void setBiomeTest(){
        enclosure.setBiome("savannah");
        assertEquals("savannah", enclosure.getBiome());
    }

    @Test
    public void countAnimalsTest(){
        assertEquals(0, enclosure.numberOfAnimals());
    }

    @Test
    public void countFoodTest(){
        assertEquals(0, enclosure.numberOfFood());
    }

    @Test
    public void acceptAnimalTest(){
        zoo.addAnimalToEnclosure(hippo, enclosure);
        assertEquals(1, enclosure.numberOfAnimals());
    }

    @Test
    public void cannotAddAnimalWithDifferentBiomeTest(){
        zoo.addAnimalToEnclosure(hippo, enclosure);
        zoo.addAnimalToEnclosure(leopard, enclosure);
        assertEquals(1, enclosure.getAnimals().size());
    }

    @Test
    public void addFoodTest(){
        enclosure.acceptFood(meat);
        enclosure.acceptFood(vegetables);
        assertEquals(2, enclosure.numberOfFood());
    }

    @Test
    public void feedAnimalsTest(){
        zoo.addAnimalToEnclosure(hippo, enclosure);
        Food food = new Food(FoodType.VEGETABLES, 5, 10);
        enclosure.feedAnimal(hippo, food);
        assertEquals(1, hippo.getBellySize());
    }

    @Test
    public void findAnimalByNameTest(){
        zoo.addAnimalToEnclosure(hippo, enclosure);
        assertEquals("Bertie", enclosure.findAnimalByName("Bertie"));
    }

}
