package example.codeclan.com.zooprojectapp;

/**
 * Created by user on 24/04/2017.
 */

public class Food implements Edible{

    private FoodType foodType;
    private int nutritionValue;

    public Food(FoodType foodType, int nutritionValue){
        this.foodType = foodType;
        this.nutritionValue = nutritionValue;
    }

    public int getNutritionValue(){
        return this.nutritionValue;
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
