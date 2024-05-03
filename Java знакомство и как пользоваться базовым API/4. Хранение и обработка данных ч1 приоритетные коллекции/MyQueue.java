import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<Integer> ll = new LinkedList<>();
    public void enqueue(Integer element){
        // добавление в конец
        
        ll.add(element);
    }

    public int dequeue(){
        // возвращает первый элемент из очереди и удаляет его
        
        return ll.remove(0);
    }

    public int first(){
        // возвращает первый элемент из очереди, не удаляя
        
        return ll.get(0);
    }

    public LinkedList<Integer> getElements() {
        // возвращает все элементы в очереди
        
        return ll;
    }
}
