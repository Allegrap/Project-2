package example.codeclan.com.zooprojectapp.animals;

import example.codeclan.com.zooprojectapp.Interfaces.Flyable;

/**
 * Created by user on 25/04/2017.
 */

public class Vulture extends Carnivore implements Flyable {

    public Vulture(String name, char gender, String maturity){
        super(name, gender, maturity);
    }

    public String fly(){
        return "I can fly!";
    }

}
