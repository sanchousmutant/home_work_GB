package animal;

import illness.Illness;
import Interface.Flyable;
import Interface.Goable;
import Interface.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Goable, Swimable{


    public Duck(String name, LocalDate birthDay, Illness title) {
        super(name, birthDay, title);
    }

    public double fly(){
        return 5;
    }

    public double go(){
        return 3;
    }

    public double swim(){
        return 4;
    }
}

