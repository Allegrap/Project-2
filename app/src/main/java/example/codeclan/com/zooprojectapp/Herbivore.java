package example.codeclan.com.zooprojectapp;

import java.util.ArrayList;

/**
 * Created by user on 24/04/2017.
 */

public class Herbivore extends Animal {


    public Herbivore(String name, String type, char gender, String maturity){
        super(name, type, gender, maturity);
    }


    @Override
    public void eat(Edible food){
        if(food.getFoodType() == FoodType.GRASS){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.VEGETABLES){
            belly.add(food);
        }
        return;
    }
}
