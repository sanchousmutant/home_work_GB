package LinkedList;

public interface MyList<T> {

    void addLast(T elem);
    void addStart(T elem);
    int getSize();
    T getElem(int idx);

}
