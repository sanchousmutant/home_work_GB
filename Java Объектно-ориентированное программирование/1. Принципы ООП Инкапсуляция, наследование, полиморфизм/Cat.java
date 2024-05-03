public class Cat extends Animals{

    public Cat(String name){
        super(name);
    }

    public void fly(){
        System.out.println(getType() + " умеют летать только с дерева ");
    }

    public void swim(){
        System.out.println(getType() + " не любят воду ");
    }
}
