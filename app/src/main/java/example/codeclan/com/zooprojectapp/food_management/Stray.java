package example.codeclan.com.zooprojectapp.food_management;

import example.codeclan.com.zooprojectapp.Interfaces.Edible;

/**
 * Created by user on 25/04/2017.
 */

public class Stray implements Edible {

    private String type;
    private FoodType foodType;
    private int nutritionalValue;

    public Stray(String type, FoodType foodType, int nutritionValue){
        this.type = type;
        this.foodType = foodType;
        this.nutritionalValue = nutritionValue;
    }

    public int getNutritionalValue(){
            return this.nutritionalValue;
        }

    public FoodType getFoodType() {
            return foodType;
        }

    public String getType() {
        return type;
    }
}
