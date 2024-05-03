package LinkedList;

public class Node<T> {
    T elem;
    Node<T> next;

    public Node(T elem) {
        this.elem = elem;
        this.next = null;
    }
}
