package example.codeclan.com.zooprojectapp.Interfaces;

import example.codeclan.com.zooprojectapp.food_management.FoodType;

/**
 * Created by user on 24/04/2017.
 */

public interface Edible {

    FoodType getFoodType();
    int getNutritionalValue();
}
