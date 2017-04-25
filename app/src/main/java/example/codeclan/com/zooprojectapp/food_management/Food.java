package example.codeclan.com.zooprojectapp.food_management;

/**
 * Created by user on 24/04/2017.
 */

public class Food implements Edible {

    private FoodType foodType;
    private int nutritionalValue;

    public Food(FoodType foodType, int nutritionValue){
        this.foodType = foodType;
        this.nutritionalValue = nutritionValue;
    }

    public int getNutritionalValue(){
        return this.nutritionalValue;
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
