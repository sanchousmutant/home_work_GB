/*
 * Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число}
 - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. 
Метод analyzeNumbers принимает на вход один параметр:
Integer[] arr - массив целых чисел.

 */

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] { 4, 2, 7, 5, 1, 3, 8, 6, 9 };
        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            lst.add(arr[i]);
        }

        lst.sort(null);
        System.out.println(lst);
        int max = lst.get(0), min = lst.get(0), sum = 0;
        for (Integer num : lst) {
            sum += num;
            if (max < num)
                max = num;
            else if (min < num)
                min = num;
        }
        System.out.printf("Minimum is %s", min);
        System.out.println();
        System.out.printf("Maximum is %s", max);
        System.out.println();
        System.out.printf("Average is = %s", sum / lst.size());

    }
}
