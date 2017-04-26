package example.codeclan.com.zooprojectapp.zoo_management;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.food_management.Stray;

/**
 * Created by user on 25/04/2017.
 */

public class Visitor {

    private String name;
    private int funds;
    private ArrayList<Stray> stray;

    public Visitor(String name, int funds, ArrayList<Stray> stray){
        this.name = name;
        this.funds = funds;
        this.stray = stray;
    }

    public Visitor(String name, int funds){
        this.name = name;
        this.funds = funds;
    }

    public String getName(){
        return name;
    }

    public int getFunds() {
        return funds;
    }

    public void payEntryFee(int entryFee){
        funds -= entryFee;
    }


    public Stray donateStray(){
        Stray donatedStray = stray.get(0);
        stray.remove(0);
        return donatedStray;
    }

}
