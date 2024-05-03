package staff;

import animal.Animal;
import illness.Illness;

public class Doctor extends Staff{

    private String diagnosis;
    public Doctor(String name, String speciality){
        super(name, speciality);
    }

    public void doDiagnose(String diagnose, Animal animal) {
        animal.setIllness(new Illness(diagnose));
    }
}