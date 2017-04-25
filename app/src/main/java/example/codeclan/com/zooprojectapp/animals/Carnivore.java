package example.codeclan.com.zooprojectapp.animals;

import example.codeclan.com.zooprojectapp.food_management.Edible;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

/**
 * Created by user on 24/04/2017.
 */

public class Carnivore extends Animal {

    public Carnivore(String name, String type, char gender, String maturity){
        super(name, type, gender, maturity);
    }

    @Override
    public void eat(Edible food){
        if(food.getFoodType() == FoodType.MEAT){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.GRASS){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.FISH){
            belly.add(food);
        }
        return;
    }
}
