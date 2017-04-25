package example.codeclan.com.zooprojectapp.zoo_management;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.zoo_management.Enclosure;
import example.codeclan.com.zooprojectapp.zoo_management.Visitor;

/**
 * Created by user on 25/04/2017.
 */

public class Zoo {

    private int entryFee;
    protected ArrayList<Enclosure> enclosures;
    protected ArrayList<Visitor> visitors;

    public Zoo(int entryFee, <Enclosure> enclosures, ArrayList<Visitor> customers){
        this.entryFee = entryFee;
        this.enclosures = new ArrayList<Enclosure>();
        this.visitors = new ArrayList<Visitor>();
    }

}
