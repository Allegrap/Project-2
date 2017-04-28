package example.codeclan.com.zooprojectapp.animals;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.Interfaces.Edible;
import example.codeclan.com.zooprojectapp.food_management.Stray;

/**
 * Created by user on 23/04/2017.
 */

public abstract class Animal {

    private String name;
    private char gender;
    private String maturity;
    private String biome;
    protected int hunger;
    protected ArrayList<Edible> belly;
    private int price;

    public Animal(String name, char gender, String maturity, String biome, int hunger, int price){
        this.name = name;
        this.gender = gender;
        this.maturity = maturity;
        this.biome = biome;
        this.hunger = hunger;
        this.belly = new ArrayList<Edible>();
        this.price = price;
    }


//  Getters and Setters
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getMaturity() {
        return maturity;
    }

    public int getPrice() {
        return price;
    }

    public String getBiome() {
        return biome;
    }

    public int getHunger() { return hunger; }

    public int getBellySize() { return belly.size(); }

    public void setName(String newName){ name = newName; }

    public void setGender(char newGender){ gender = newGender; }

    public void setMaturity(String newMaturity){ maturity = newMaturity; }

    public void setPrice(int newPrice){ price = newPrice; }

    public void setBiome(String newBiome){ biome = newBiome; }


//  Other stuff

    public void eat(Edible edible){
        belly.add(edible);
        hunger -= edible.getNutritionalValue();
    }

    public void sleep(){
        belly.clear();
    }

    public int totalNutrition(){
        int totalFood = 0;
        for(Edible food : belly){
            totalFood += food.getNutritionalValue();
        }
        return totalFood;
    }

    public String play(){
        return "I am playing!";
    }

}
