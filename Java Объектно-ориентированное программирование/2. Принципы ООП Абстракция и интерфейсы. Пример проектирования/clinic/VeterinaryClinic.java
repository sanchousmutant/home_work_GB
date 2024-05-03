package clinic;

import animal.Animal;
import Interface.Flyable;
import Interface.Goable;
import Interface.Swimable;
import staff.Staff;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Staff> personal;
    private List<Animal> patients;
    public VeterinaryClinic(){
        this.personal = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    public List<Staff> getPersonal(){
        return personal;
    }

    public List<Animal> getPatients(){
        return patients;
    }

    public List<Animal> getFly(List<Animal> patients){
        List<Animal> animalsFly = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Flyable) {
                animalsFly.add(animal);
            }
        }
        System.out.println("животные, которые умеют летать: ");
        return animalsFly;
    }

    public List<Animal> getGo(List<Animal> patients){
        List<Animal> animalsGo = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Goable) {
                animalsGo.add(animal);
            }
        }
        System.out.println("животные, которые умеют ходить: ");
        return animalsGo;
    }

    public List<Animal> getSwim(List<Animal> patients){
        List<Animal> animalsSwim = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Swimable) {
                animalsSwim.add(animal);
            }
        }
        System.out.println("животные, которые умеют плавать: ");
        return animalsSwim;
    }

    public void addStaff(Staff staff) {
        personal.add(staff);
    }
}
