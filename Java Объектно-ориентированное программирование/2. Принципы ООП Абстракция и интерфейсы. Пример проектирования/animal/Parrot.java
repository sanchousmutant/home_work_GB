package animal;

import illness.Illness;
import Interface.Flyable;
import Interface.Goable;

import java.time.LocalDate;

public class Parrot extends Animal implements Goable, Flyable {


    public Parrot(String name, LocalDate birthDay, Illness title) {
        super(name, birthDay, title);
    }

    public double fly(){
        return 5;
    }

    public double go(){
        return 2;
    }
}
