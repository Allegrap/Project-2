package example.codeclan.com.zooprojectapp;

/**
 * Created by user on 24/04/2017.
 */

public abstract class Food implements Edible{

    int nutritionValue;

    public Food(int nutritionValue){
        this.nutritionValue = nutritionValue;
    }

    public int getNutritionValue(){
        return this.nutritionValue;
    }

}
