package example.codeclan.com.zooprojectapp;

import java.util.ArrayList;

/**
 * Created by user on 23/04/2017.
 */

public class Enclosure {

    private ArrayList<Animal> animals;
    private ArrayList<Integer> availableFood;

    public Enclosure(ArrayList<Animal> animals, ArrayList<Integer> availableFood){
        this.animals = animals;
        this.availableFood = availableFood;
    }

    public int numberOfAnimals() {
        return animals.size();
    }
}
