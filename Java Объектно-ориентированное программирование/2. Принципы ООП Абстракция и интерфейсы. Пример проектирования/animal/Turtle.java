package animal;

import illness.Illness;
import Interface.Goable;
import Interface.Swimable;

import java.time.LocalDate;

public class Turtle extends Animal implements Goable, Swimable {


    public Turtle(String name, LocalDate birthDay, Illness title) {
        super(name, birthDay, title);
    }

    public double go(){
        return 1;
    }

    public double swim(){
        return 2;
    }
}
