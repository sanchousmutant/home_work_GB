package pharmacy;

import pharmacy.components.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Comparable<Pharmacy>, Iterator<Component> {
    private List<Component> components;
    private int idx;
    public Pharmacy(){
        this.components = new ArrayList<>();
        this.idx = 0;
    }

    public Pharmacy addComponent(Component item){
        components.add(item);
        return this;
    }

    public static int powerAllComponents(Pharmacy pharmacy) {
        int sumPower = 0;
        for (Component component : pharmacy.components) {
            sumPower += component.getPower();
        }
        return sumPower;
    }

    @Override
    public int compareTo(Pharmacy pharmacy) {
        int sumPower = powerAllComponents(this);
        int otherSumPower = powerAllComponents(pharmacy);

        return Integer.compare(sumPower, otherSumPower);
    }

    @Override
    public boolean hasNext() {
        return idx < components.size();
    }

    @Override
    public Component next() {
        return components.get(idx++);
    }

    @Override
    public String toString() {
        return this.components.toString() + "\n";
    }
}
