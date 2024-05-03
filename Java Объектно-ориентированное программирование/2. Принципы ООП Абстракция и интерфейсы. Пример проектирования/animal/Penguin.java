package animal;

import illness.Illness;
import Interface.Goable;
import Interface.Swimable;

import java.time.LocalDate;

public class Penguin extends Animal implements Goable, Swimable{


    public Penguin(String name, LocalDate birthDay, Illness title) {
        super(name, birthDay, title);
    }

    public double go(){
        return 2;
    }

    public double swim(){
        return 5;
    } 
}
