package example.codeclan.com.zooprojectapp.zoo_management;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.food_management.Stray;
import example.codeclan.com.zooprojectapp.zoo_management.Enclosure;
import example.codeclan.com.zooprojectapp.zoo_management.Visitor;

/**
 * Created by user on 25/04/2017.
 */

public class Zoo {

    private int entryFee;
    protected int totalMoney;
    private int capacity;
    private ArrayList<Enclosure> enclosures;
    private ArrayList<Visitor> visitors;
    private ArrayList<Stray> strays;

    public Zoo(int entryFee, int totalMoney, int capacity) {
        this.entryFee = entryFee;
        this.totalMoney = totalMoney;
        this.capacity = capacity;
        this.enclosures = new ArrayList<Enclosure>();
        this.visitors = new ArrayList<Visitor>();
        this.strays = new ArrayList<Stray>();
    }

    public int getEntryFee() {
        return entryFee;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public int getCapacity() { return capacity; }

    public String getEnclosures(){
        String message = "";
        for(Enclosure enclosure : enclosures){
            message = message + enclosure.getName();
        }
        return message;
    }

    public String getVisitors(){
        String message = "";
        for (Visitor visitor : visitors){
            message = message + visitor.getName();
        }
        return message;
    }

    public int enclosureCount(){
        return enclosures.size();
    }

    public int visitorCount(){
        return visitors.size();
    }

    public int strayCount(){
        return strays.size();
    }

    public void addEnclosure(Enclosure enclosure){
        enclosures.add(enclosure);
    }

    public void addVisitor(Visitor visitor) {
        if (visitorCount() < capacity) {
            visitors.add(visitor);
        }

        totalMoney += entryFee;
        visitor.payEntryFee(entryFee);
    }

    public void acceptStray(Stray stray){
        strays.add(stray);
    }
}
