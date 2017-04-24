package example.codeclan.com.zooprojectapp;

/**
 * Created by user on 23/04/2017.
 */

public abstract class Animal {

    private String name;
    private String type;
    private char gender;
    private String maturity;

    public Animal(String name, String type, char gender, String maturity){
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.maturity = maturity;
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
