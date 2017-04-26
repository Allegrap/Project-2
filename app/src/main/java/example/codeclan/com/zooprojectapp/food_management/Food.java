package example.codeclan.com.zooprojectapp.food_management;

import example.codeclan.com.zooprojectapp.Interfaces.Edible;

/**
 * Created by user on 24/04/2017.
 */

public class Food implements Edible {

    private FoodType foodType;
    private int nutritionalValue;
    private int price;

    public Food(FoodType foodType, int nutritionValue, int price){
        this.foodType = foodType;
        this.nutritionalValue = nutritionValue;
        this.price = price;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public int getNutritionalValue(){
        return this.nutritionalValue;
    }

    public int getPrice() { return price; }
}
