package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.zoo_management.Visitor;
import example.codeclan.com.zooprojectapp.zoo_management.Zoo;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class VisitorTest {

    Visitor visitor;
    Zoo zoo;

    @Before
    public void before(){
        visitor = new Visitor("Allegra", 400);
        zoo = new Zoo(20, 5000);
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

}
