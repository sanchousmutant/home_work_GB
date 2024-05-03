import java.util.LinkedList;

/**
 * Дан LinkedList с несколькими элементами разного типа.
 * В методе revert класса LLTasks
 * реализуйте разворот этого списка без
 * использования встроенного функционала.
 * // Дан
 * [1, One, 2, Two]
 * // Вывод
 * [1, One, 2, Two]
 * [Two, 2, One, 1]
 */

public class Task1{ 
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();

        if (args.length == 0 || args.length != 4) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }

        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}