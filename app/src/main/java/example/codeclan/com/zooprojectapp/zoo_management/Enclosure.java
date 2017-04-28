package example.codeclan.com.zooprojectapp.zoo_management;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.Interfaces.Edible;
import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.animals.Animal;

/**
 * Created by user on 23/04/2017.
 */

public class Enclosure {

    private String name;
    private String biome;
    private ArrayList<Animal> animals;
    private ArrayList<Food> food;

    public Enclosure(String name, String biome){
        this.name = name;
        this.biome = biome;
        this.animals = new ArrayList<Animal>();
        this.food = new ArrayList<Food>();
    }

//  Getters and setters
    public String getName(){
        return name;
    }

    public String getBiome() { return biome; }

    public ArrayList<Animal> getAnimals(){
        return new ArrayList<Animal>(animals);
    }

    public ArrayList<Food> getFood(){ return new ArrayList<Food>(food); }

    public void setName(String newName){
        name = newName;
    }

    public void setBiome(String newBiome){  biome = newBiome; }


//  Others
    public int numberOfAnimals() {
        return animals.size();
    }

    public int numberOfFood() {
        return food.size();
    }

    public void acceptAnimal(Animal animal){
        animals.add(animal);
    }

    public void addFood(Food foods){
        food.add(foods);
    }

    public void feedAnimal(Animal animalToFeed, Edible edible){
        for(Animal animal : animals){
            if(animalToFeed.getName() == animal.getName()) {
                animal.eat(edible);
            }
        }
    }

}
