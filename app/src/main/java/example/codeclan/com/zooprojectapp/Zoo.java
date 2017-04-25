package example.codeclan.com.zooprojectapp;

import java.util.ArrayList;

/**
 * Created by user on 25/04/2017.
 */

public class Zoo {

    protected ArrayList<Enclosure> enclosures;
    protected ArrayList<Visitor> visitors;

    public Zoo(ArrayList<Enclosure> enclosures, ArrayList<Visitor> customers){
        this.enclosures = new ArrayList<Enclosure>();
        this.visitors = new ArrayList<Visitor>();
    }

}
