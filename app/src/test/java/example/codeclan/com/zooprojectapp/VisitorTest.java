package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

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
        visitor = new Visitor("Allegra", 400);
        zoo = new Zoo(20, 5000);
        stray = new Stray("dog", FoodType.MEAT, 30);
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

    //TRY TOMORROW
//    @Test
//    public void canDonateStray(){
//        visitor.donateStray(stray);
//        assertEquals(1, zoo.strayCount());
//    }

}
