package example.codeclan.com.zooprojectapp.animals;

/**
 * Created by user on 25/04/2017.
 */

public class Hyena extends Carnivore implements Scavangeable{

    public Hyena(String name, char gender, String maturity){
        super(name, gender, maturity);
    }

    public void scavenge(){
        return "I am a scavenger";
    }

}
