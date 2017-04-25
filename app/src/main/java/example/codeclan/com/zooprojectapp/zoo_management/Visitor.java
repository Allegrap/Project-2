package example.codeclan.com.zooprojectapp.zoo_management;

import example.codeclan.com.zooprojectapp.food_management.Stray;

/**
 * Created by user on 25/04/2017.
 */

public class Visitor {

    private String name;
    private int funds;
    private boolean stray;

    public Visitor(String name, int funds, boolean stray){
        this.name = name;
        this.funds = funds;
        this.stray = stray;
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

//  TRY TOMORROW
//    public void donateStray(){
//        if(stray == true){
//            Zoo.acceptStray();
//        }
//    }

}
