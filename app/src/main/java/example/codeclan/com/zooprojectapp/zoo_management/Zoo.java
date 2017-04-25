package example.codeclan.com.zooprojectapp.zoo_management;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.zoo_management.Enclosure;
import example.codeclan.com.zooprojectapp.zoo_management.Visitor;

/**
 * Created by user on 25/04/2017.
 */

public class Zoo {

    private int entryFee;
    private int totalMoney;
    private ArrayList<Enclosure> enclosures;
    private ArrayList<Visitor> visitors;

    public Zoo(int entryFee, int totalMoney, ArrayList<Enclosure> enclosures, ArrayList<Visitor> customers){
        this.entryFee = entryFee;
        this.totalMoney = totalMoney;
        this.enclosures = enclosures;
        this.visitors = customers;
    }

    public Zoo(int entryFee, int totalMoney) {
        this.entryFee = entryFee;
        this.totalMoney = totalMoney;
        this.enclosures = new ArrayList<Enclosure>();
        this.visitors = new ArrayList<Visitor>();
    }

    public int getEntryFee() {
        return entryFee;
    }

    public int enclosureCount(){
        return enclosures.size();
    }

    public int visitorCount(){
        return visitors.size();
    }

    public void addEnclosure(Enclosure enclosure){
        enclosures.add(enclosure);
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    public int getTotalMoney() {
        return totalMoney;
    }
}
