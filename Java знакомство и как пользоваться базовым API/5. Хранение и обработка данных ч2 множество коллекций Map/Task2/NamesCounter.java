// Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу,
// которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены)
// и подсчитывает, сколько раз каждое имя встречается.
// Программа должна использовать HashMap для хранения имен и их количества вхождений.
// По завершении, программа выводит результат в виде пар "имя - количество".

package Task2;

import java.util.HashMap;

public class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    // Метод для добавления имени в HashMap
    public void addName(String name) {
        
        int count = 1;
        if (names.containsKey(name)) {
            count = names.get(name);
            count++;
            names.replace(name, count);
        }else names.put(name, count);
    }

    // Метод для вывода содержимого HashMap
    public void showNamesOccurrences() {
       
        System.out.println(names);
    }
}
