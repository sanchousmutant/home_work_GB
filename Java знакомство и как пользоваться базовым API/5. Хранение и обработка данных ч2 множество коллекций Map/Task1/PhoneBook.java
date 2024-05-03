package Task1;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции add, find, getPhoneBook
 */
public class PhoneBook {
     private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        // Добавляет запись в телефонную книгу.
        // Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
        // Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> phoneList = new ArrayList<>();
            phoneList.add(phoneNum);
            phoneBook.put(name, phoneList);
        }


}

    public ArrayList<Integer> find(String name) {
        //  Поиск номеров телефона по имени в телефонной книге.
        // Если запись с именем name существует, возвращает список номеров телефона для этой записи.
        // Если запись с именем name не существует, возвращает пустой список.
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            ArrayList<Integer> phoneList = new ArrayList<>();
            return phoneList;
    }

}

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
            // Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена,
            // а значения - списки номеров телефона.
            return phoneBook;

    }
    
}