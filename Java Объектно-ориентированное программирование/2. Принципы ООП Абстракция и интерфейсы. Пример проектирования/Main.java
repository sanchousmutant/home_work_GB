import animal.Animal;
import animal.Cat;
import animal.Duck;
import animal.Parrot;
import animal.Penguin;
import animal.Snake;
import animal.Turtle;
import clinic.VeterinaryClinic;
import illness.Illness;
import java.time.LocalDate;
import staff.Doctor;
import staff.Nurse;

public class Main {

    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();
        Doctor doctor = new Doctor("Ivanov II", "terapevt");
        Nurse nurse = new Nurse("Sidorova SS", "nurse");

        Animal cat = new Cat("barsik", LocalDate.of(1984,2,3), new Illness("чумка"));
        Animal duck = new Duck("makdak", LocalDate.of(1985, 11, 3), null);
        Animal parrot = new Parrot("borja", LocalDate.of(2000, 8, 20), null);
        Animal penguin = new Penguin("lolo", LocalDate.of(1970, 3, 14), null);
        Animal snake = new Snake("vova", LocalDate.of(1960, 12, 30), null);
        Animal turtle = new Turtle("mike", LocalDate.of(1998, 7, 7), null);
        clinic.addPatient(cat); // добавляем пациента
        clinic.addPatient(duck);
        clinic.addPatient(parrot);
        clinic.addPatient(penguin);
        clinic.addPatient(snake);
        clinic.addPatient(turtle);
       // System.out.println(clinic.getFly(clinic.getPatients())); // все кто летают

        nurse.doRename("murzik", cat); // измененине имени
        System.out.println(cat);

        //System.out.println(cat.getIllness()); // вывод диагноза пациента
       // System.out.println(clinic.getPatients()); // вывод списка пациентов

        // doctor.doDiagnose("бешенство", cat); // новый диагноз пациента cat
        // System.out.println(cat.getIllness());

        // System.out.println(clinic.getPatients()); // вывод пациентов клиники
        // clinic.addStaff();  // новый сотрудник
        // System.out.println(clinic.getPersonal()); // список персонала
    }
}