package LinkedList;

public class MyLinkedList<T> implements MyList<T>{
    private Node<T> head;

    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void addLast(T elem) {
        Node<T> node = new Node<>(elem);
        if (head == null) {
            head = node;
        }else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
        size++;
        }

    @Override
    public void addStart(T elem) {
        Node<T> node = new Node<>(elem);
        node.next = head;
        head = node;
        size++;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T getElem(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> currentHead = head;
        for (int i = 0; i < idx; i++) {
            currentHead = currentHead.next;
        }
        return currentHead.elem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        Node<T> currentNode = head;
        if (currentNode == null) {
            return "{}";
        }else {
            while (currentNode != null) {
                sb.append(currentNode.elem).append(",");
                currentNode = currentNode.next;
            }
            sb.deleteCharAt(sb.length() - 1).append("}");
            return sb.toString();
        }
    }
}