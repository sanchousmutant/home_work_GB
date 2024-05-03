public class Snake extends Animals{
    
    public Snake(String name){
        super(name);
    }

    public void toGo(){
        System.out.println(getType() + " не могут ходить - они ползают! ");
    }

    public void fly(){
        System.out.println(getType() + " это только в ваших фантазиях ");
    }
}
