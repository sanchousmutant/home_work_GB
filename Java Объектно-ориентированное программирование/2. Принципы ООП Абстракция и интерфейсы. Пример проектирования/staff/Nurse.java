package staff;

import animal.Animal;

public class Nurse extends Staff{


    public Nurse(String name, String speciality) {
        super(name, speciality);
    }

    public void doRename(String name, Animal animal){
        animal.setAnimal(name);
    }
}
