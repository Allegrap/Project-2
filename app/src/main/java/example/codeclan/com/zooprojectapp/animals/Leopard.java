package example.codeclan.com.zooprojectapp.animals;

import example.codeclan.com.zooprojectapp.Interfaces.Climbable;

/**
 * Created by user on 25/04/2017.
 */

public class Leopard extends Carnivore implements Climbable{

    public Leopard(String name, char gender, String maturity, String biome, int hunger, int price){
        super(name, gender, maturity, biome, hunger, price);
    }

    public String climb(){
        return "I can climb!";
    }

}
