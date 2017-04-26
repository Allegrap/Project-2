package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import example.codeclan.com.zooprojectapp.food_management.FoodType;
import example.codeclan.com.zooprojectapp.food_management.Stray;
import example.codeclan.com.zooprojectapp.zoo_management.Visitor;
import example.codeclan.com.zooprojectapp.zoo_management.Zoo;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class VisitorTest {

    Visitor visitor;
    Zoo zoo;
    Stray stray;

    @Before
    public void before(){
        stray = new Stray("dog", FoodType.MEAT, 30);
        ArrayList<Stray> list = new ArrayList<Stray>();
        list.add(stray);

        visitor = new Visitor("Allegra", 400, list);
        zoo = new Zoo(20, 5000, 2);
    }

    @Test
    public void canGetNameTest(){
        assertEquals("Allegra", visitor.getName());
    }

    @Test
    public void canGetFundsTest(){
        assertEquals(400, visitor.getFunds());
    }

    @Test
    public void canPayEntryFee(){
        visitor.payEntryFee(zoo.getEntryFee());
        assertEquals(380, visitor.getFunds());
    }

    @Test
    public void canCountStrays(){
        assertEquals(1, visitor.strayCount());
    }

    @Test
    public void canAddStray(){

    }

//    @Test
//    public void canDonateStray(){
//        visitor.addStray()
//        visitor.donateStray();
//        assertEquals(1, zoo.strayCount());
//        assertEquals(0, visitor.strayCount());
//    }

}
