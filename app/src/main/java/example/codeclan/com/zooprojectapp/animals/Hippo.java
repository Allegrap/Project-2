package example.codeclan.com.zooprojectapp.animals;

import example.codeclan.com.zooprojectapp.Interfaces.Swimmable;

/**
 * Created by user on 25/04/2017.
 */

public class Hippo extends Herbivore implements Swimmable{

    public Hippo(String name, char gender, String maturity, int price){
        super(name, gender, maturity, price);
    }

    public String swim(){
        return "I am swimming!";
    }

}
