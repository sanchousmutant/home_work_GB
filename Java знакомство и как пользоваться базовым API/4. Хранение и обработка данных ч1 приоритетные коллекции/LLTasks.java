import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll){ 
        // разворот списка
        LinkedList<Object> linkedList2 = new LinkedList<>();

        for (int i = ll.size() - 1; i >= 0; i--)
            {linkedList2.add(ll.get(i));}
        ll.clear();
        for (int i = 0; i < linkedList2.size(); i++)
            {ll.add(i, linkedList2.get(i));}
        return ll;

        }
    }        
