package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.animals.Hippo;
import example.codeclan.com.zooprojectapp.animals.Leopard;
import example.codeclan.com.zooprojectapp.food_management.FoodType;
import example.codeclan.com.zooprojectapp.food_management.Stray;
import example.codeclan.com.zooprojectapp.zoo_management.Enclosure;
import example.codeclan.com.zooprojectapp.zoo_management.Visitor;
import example.codeclan.com.zooprojectapp.zoo_management.Zoo;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class ZooTest {

    Zoo zoo;
    Enclosure enclosure1;
    Hippo hippo;
    Leopard leopard;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Stray stray;

    @Before
    public void before(){
        stray = new Stray("dog", FoodType.MEAT, 30);
        ArrayList<Stray> list = new ArrayList<Stray>();
        list.add(stray);

        zoo = new Zoo(20, 5000, 2);
        enclosure1 = new Enclosure();
        hippo = new Hippo("Bertie", 'm', "adult", "grassland", 900);
        leopard = new Leopard("Darren", 'm', "baby", "rainforest", 700);
        visitor1 = new Visitor("Allegra", 400);
        visitor2 = new Visitor("Chiara", 10, list);
        visitor3 = new Visitor("Talitha", 20);
    }

    @Test
    public void canGetEntryFeeTest(){
        assertEquals(20, zoo.getEntryFee());
    }

    @Test
    public void canCountEnclosuresTest(){
        assertEquals(0, zoo.enclosureCount());
    }

    @Test
    public void canAddEnclosureTest(){
        zoo.addEnclosure(enclosure1);
        assertEquals(1, zoo.enclosureCount());
    }

    @Test
    public void canCountVisitorsTest(){
        assertEquals(0, zoo.visitorCount());
    }

    @Test
    public void canAddVisitorTest(){
        zoo.addVisitor(visitor1);
        assertEquals(1, zoo.visitorCount());
        assertEquals(5020, zoo.getTotalMoney());
        assertEquals(380, visitor1.getFunds());
    }

    @Test
    public void cannotAddVisitorsOverCapacity(){
        zoo.addVisitor(visitor1);
        zoo.addVisitor(visitor2);
        zoo.addVisitor(visitor3);
        assertEquals(2, zoo.visitorCount());
    }

    @Test
    public void canGetTotalMoney(){
        assertEquals(5000, zoo.getTotalMoney());
    }

    @Test
    public void canCountStraysTest(){
        assertEquals(0, zoo.strayCount());
    }

    @Test
    public void canAcceptStray(){
        Stray donatedStray = visitor2.donateStray();
        zoo.acceptStray(donatedStray);
        assertEquals(1, zoo.strayCount());
    }

    @Test
    public void canGetEnclosures(){
        assertEquals();
    }


}
