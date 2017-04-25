package example.codeclan.com.zooprojectapp;

import java.util.ArrayList;

/**
 * Created by user on 25/04/2017.
 */

public class Zoo {

    protected ArrayList<Enclosure> enclosures;
    protected ArrayList<Customer> customers;

    public Zoo(ArrayList<Enclosure> enclosures, ArrayList<Customer> customers){
        this.enclosures = new ArrayList<Enclosure>();
        this.customers = new ArrayList<Customer>();
    }

}
