package pharmacy.components;

public abstract class Component{
    private String name;
    private double weight;
    private int power;

    public Component(String name, double weight, int power){
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getPower(){
        return power;
    }


    @Override
    public String toString() {
        return String.format("Name: %s, power: %s\n", this.name, this.power);
    }
}
