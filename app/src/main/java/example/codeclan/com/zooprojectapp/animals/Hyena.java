package example.codeclan.com.zooprojectapp.animals;

import example.codeclan.com.zooprojectapp.Interfaces.Scavengeable;

/**
 * Created by user on 25/04/2017.
 */

public class Hyena extends Carnivore implements Scavengeable {

    public Hyena(String name, char gender, String maturity){
        super(name, gender, maturity);
    }

    public String scavenge(){
        return "I am a scavenger";
    }

}
