package example.codeclan.com.zooprojectapp;

import org.junit.Before;
import org.junit.Test;

import example.codeclan.com.zooprojectapp.zoo_management.Visitor;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 25/04/2017.
 */

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Allegra", 400);
    }

    @Test
    public void canGetNameTest(){
        assertEquals("Allegra", visitor.getName());
    }


}
