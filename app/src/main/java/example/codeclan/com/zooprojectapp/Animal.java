package example.codeclan.com.zooprojectapp;

import java.util.ArrayList;

/**
 * Created by user on 23/04/2017.
 */

public abstract class Animal {

    private String name;
    private String type;
    private char gender;
    private String maturity;
    private ArrayList<Edible> belly;

    public Animal(String name, String type, char gender, String maturity){
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.maturity = maturity;
        this.belly = new ArrayList<Edible>();
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public char getGender() {
        return gender;
    }

    public String getMaturity() {
        return maturity;
    }
}
