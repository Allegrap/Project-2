package example.codeclan.com.zooprojectapp;

import java.util.ArrayList;

/**
 * Created by user on 24/04/2017.
 */

public class Herbivore extends Animal {

    private ArrayList<Edible> belly;

    public Herbivore(String name, String type, char gender, String maturity){
        super(name, type, gender, maturity);
        this.belly = new ArrayList<Edible>();
    }

    @Override
    public void eat(Food food){
        if(food.getFoodType() == FoodType.GRASS){
            belly.add(food);
        }
        else if(food.getFoodType() == FoodType.VEGETABLES){
            belly.add(food);
        }
        return;
    }
}
