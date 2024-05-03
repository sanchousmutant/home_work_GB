package animal;

import illness.Illness;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected Illness illness;

    public Animal(String name, LocalDate birthDay, Illness title){
        this.name = name;
        this.birthDay = birthDay;
        this.illness = title;
    }

    public void setIllness(Illness illness){
        this.name = name;
        this.illness = illness;
    }

    public void setAnimal(String name){
        this.name = name;
    }

    public Illness getIllness(){
        return illness;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("кличка = %s, день рождения = %s, диагноз = %s", name, birthDay, illness);
    }
}
