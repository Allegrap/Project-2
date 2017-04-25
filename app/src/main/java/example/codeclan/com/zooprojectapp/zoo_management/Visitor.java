package example.codeclan.com.zooprojectapp.zoo_management;

/**
 * Created by user on 25/04/2017.
 */

public class Visitor {

    private String name;
    private int funds;

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

}
