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
    Stray stray2;

    @Before
    public void before(){
        stray = new Stray("dog", FoodType.MEAT, 30);
        ArrayList<Stray> list = new ArrayList<Stray>();
        list.add(stray);

        visitor = new Visitor("Allegra", 400, list);
        zoo = new Zoo(20, 5000, 2);
        stray2 = new Stray("cat", FoodType.MEAT, 20);
    }

    @Test
    public void getNameTest(){
        assertEquals("Allegra", visitor.getName());
    }

    @Test
    public void getFundsTest(){
        assertEquals(400, visitor.getFunds());
    }

    @Test
    public void setNameTest(){
        visitor.setName("Chris");
        assertEquals("Chris", visitor.getName());
    }

    @Test
    public void setFundsTest(){
        visitor.setFunds(300);
        assertEquals(300, visitor.getFunds());
    }

    @Test
    public void payEntryFeeTest(){
        visitor.payEntryFee(zoo.getEntryFee());
        assertEquals(380, visitor.getFunds());
    }

    @Test
    public void countStraysTest(){
        assertEquals(1, visitor.strayCount());
    }

    @Test
    public void addStrayTest(){
        visitor.addStray(stray2);
        assertEquals(2, visitor.strayCount());
    }

    @Test
    public void donateStrayTest(){
        Stray strayToDonate = visitor.donateStray();
        zoo.acceptStray(strayToDonate);
        assertEquals(1, zoo.strayCount());
        assertEquals(0, visitor.strayCount());
    }

}
