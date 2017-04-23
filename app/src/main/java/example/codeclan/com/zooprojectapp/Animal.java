package example.codeclan.com.zooprojectapp;

/**
 * Created by user on 23/04/2017.
 */

public class Animal {

    private String name;
    private String type;
    private char gender;
    private boolean predator;
    private String maturity;

    public Animal(String name, String type, char gender, boolean predator, String maturity){
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.predator = predator;
        this.maturity = maturity;
    }


    public String getName() {
        return name;
    }
}
