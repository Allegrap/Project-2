package example.codeclan.com.zooprojectapp.animals;

import example.codeclan.com.zooprojectapp.Interfaces.Flyable;
import example.codeclan.com.zooprojectapp.Interfaces.Scavengeable;

/**
 * Created by user on 25/04/2017.
 */

public class Vulture extends Carnivore implements Flyable, Scavengeable {

    public Vulture(String name, char gender, String maturity, String biome, int hunger, int price){
        super(name, gender, maturity, biome, hunger, price);
    }

    public String fly(){
        return "I can fly!";
    }

    public String scavenge(){
        return "I am a scavenger!";
    }

}
