/**
 * Animals
 */
public class Animals {

    protected String name;

    public Animals(String name){
        this.name = name;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    protected void toGo(){
        System.out.println(getType() + " пошел ");
    }

    protected void fly(){
        System.out.println(getType() + " полетел ");
    }

    protected void swim(){
        System.out.println(getType() + " поплыл ");
    }

    public void justDoIt(){
        toGo();
        fly();
        swim();
    }
}