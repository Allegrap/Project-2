package example.codeclan.com.zooprojectapp.animals;

import example.codeclan.com.zooprojectapp.Interfaces.Edible;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

/**
 * Created by user on 24/04/2017.
 */

public abstract class Herbivore extends Animal {


    public Herbivore(String name, char gender, String maturity, int price){
        super(name, gender, maturity, price);
    }


    @Override
    public void eat(Edible food){
        if(food.getFoodType() == FoodType.GRASS){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.VEGETABLES){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.FRUIT){
            belly.add(food);
        }
        return;
    }
}
