import pharmacy.Pharmacy;
import pharmacy.components.Component;
import pharmacy.components.Penicillin;
import pharmacy.components.Salt;
import pharmacy.components.Water;
import pharmacy.components.Component;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1
                .addComponent(new Penicillin("Component1", 2.0, 10))
                .addComponent(new Water("Water", 5.0, 5))
                .addComponent(new Salt("Salt", 10.0, 20));
        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponent(new Penicillin("Component2", 3.0, 8))
                .addComponent(new Water("Water", 4.0, 4))
                .addComponent(new Salt("Salt", 5.0, 7));
        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3
                .addComponent(new Penicillin("Penicilin", 3.0, 4))
                .addComponent(new Salt("Salt", 20.0, 40))
                .addComponent(new Water("Water", 2.0, 14));

        ArrayList<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);

//        for (Pharmacy pharmacy: pharmacies){
//            System.out.println(pharmacy);
//        }
        System.out.println(pharmacies);
        System.out.println("--------------");

        Collections.sort(pharmacies);
        System.out.println(pharmacies);
//        for (Pharmacy pharmacy: pharmacies){
//            System.out.println(pharmacy);
//        }



    }
}
