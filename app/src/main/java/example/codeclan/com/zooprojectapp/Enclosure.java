package example.codeclan.com.zooprojectapp;

import java.util.ArrayList;

/**
 * Created by user on 23/04/2017.
 */

public class Enclosure {

    private ArrayList<Animal> animals;
    private ArrayList<Integer> availableFood;

    public Enclosure(){
        this.animals = new ArrayList<Animal>();
        this.availableFood = new ArrayList<Integer>();
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
}
