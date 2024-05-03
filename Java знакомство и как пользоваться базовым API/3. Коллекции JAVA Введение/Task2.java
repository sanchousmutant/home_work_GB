/*
 * Напишите свой код в методе removeEvenNumbers
 *  Метод removeEvenNumbers принимает на вход один параметр:
 *  Integer[] arr - список целых чисел, возвращает
 *  список ArrayList<Integer>
 * Исходный массив:
    1, 2, 3, 4, 5, 6, 7, 8, 9
    Результат:
    [1, 3, 5, 7, 9]
 */

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Integer[] arr = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] arr = new Integer[] {2, 4, 6, 8};
        removeEvenNumbers(arr);
    }
    public static void removeEvenNumbers(Integer[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] % 2 == 0)) {
                res.add(arr[i]);
            }
        }
        System.out.println(res);
    }
}
