package example.codeclan.com.zooprojectapp.zoo_management;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.Interfaces.Edible;
import example.codeclan.com.zooprojectapp.food_management.Food;
import example.codeclan.com.zooprojectapp.animals.Animal;

/**
 * Created by user on 23/04/2017.
 */

public class Enclosure {

    private ArrayList<Animal> animals;
    private ArrayList<Food> food;

    public Enclosure(){
        this.animals = new ArrayList<Animal>();
        this.food = new ArrayList<Food>();
    }

    public int numberOfAnimals() {
        return animals.size();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals(){
        return new ArrayList<Animal>(animals);
    }

    public void feedAnimal(Animal animalToFeed, Edible edible){

        for(Animal animal : animals){
            if(animalToFeed.getName() == animal.getName()) {
                animal.eat(edible);
            }
        }
    }
}
