package animal;

import illness.Illness;
import Interface.Goable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable{


    public Cat(String name, LocalDate birthDay, Illness title) {
        super(name, birthDay, title);
    }

    @Override
    public double go(){
        return 5;
    }
}
