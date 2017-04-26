package example.codeclan.com.zooprojectapp.zoo_management;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.food_management.Stray;

/**
 * Created by user on 25/04/2017.
 */

public class Visitor {

    private String name;
    private int funds;
    private ArrayList<Stray> strays;

    public Visitor(String name, int funds, ArrayList<Stray> strays){
        this.name = name;
        this.funds = funds;
        this.strays = strays;
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

    public void setName(String newName){
        name = newName;
    }

    public void setFunds(int newFunds){
        funds= newFunds;
    }

    public void payEntryFee(int entryFee){
        funds -= entryFee;
    }

    public void addStray(Stray stray){ strays.add(stray); }

    public int strayCount(){
        return strays.size();
    }

    public Stray donateStray(){
        Stray donatedStray = strays.get(0);
        strays.remove(0);
        return donatedStray;
    }

}
