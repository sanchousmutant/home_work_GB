import LinkedList.MyLinkedList;
import LinkedList.MyList;
import LinkedList.Node;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList= new MyLinkedList<>();
        myList.addLast(2);
        myList.addLast(4);
        myList.addStart(1);
        System.out.println(myList);
    }
}
