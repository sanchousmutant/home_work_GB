package animal;

import illness.Illness;
import Interface.Swimable;

import java.time.LocalDate;

public class Snake extends Animal implements Swimable{


    public Snake(String name, LocalDate birthDay, Illness title) {
        super(name, birthDay, title);
    }

    public double swim(){
        return 2;
    }
}
