package example.codeclan.com.zooprojectapp.animals;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.Interfaces.Edible;

/**
 * Created by user on 23/04/2017.
 */

public abstract class Animal {

    private String name;
    private char gender;
    private String maturity;
    private String biome;
    private int hunger;
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

    public int getBellySize() { return belly.size(); }

    public void eat(Edible edible){
        belly.add(edible);
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


    public int getHunger() {
        return hunger;
    }
}
