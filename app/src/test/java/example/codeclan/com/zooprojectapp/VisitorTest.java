package example.codeclan.com.zooprojectapp;

import org.junit.Before;

import example.codeclan.com.zooprojectapp.zoo_management.Visitor;

/**
 * Created by user on 25/04/2017.
 */

public class VisitorTest {

    Visitor visitor;

    @Before
    public class before(){
        visitor = new Visitor("Allegra", 400);
    }

}
