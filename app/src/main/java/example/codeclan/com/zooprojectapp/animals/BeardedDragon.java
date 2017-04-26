package example.codeclan.com.zooprojectapp.animals;

import example.codeclan.com.zooprojectapp.Interfaces.Climbable;
import example.codeclan.com.zooprojectapp.Interfaces.Edible;
import example.codeclan.com.zooprojectapp.food_management.FoodType;

/**
 * Created by user on 26/04/2017.
 */

public class BeardedDragon extends Omnivore implements Climbable {

    public BeardedDragon(String name, char gender, String maturity, String biome, int price){
        super(name, gender, maturity, biome, price);
    }

    public String climb(){
        return "I can climb!";
    }

    @Override
    public void eat(Edible food){
        if(food.getFoodType() == FoodType.INSECTS){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.GRASS){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.VEGETABLES){
            belly.add(food);
        }
        return;
    }

}
