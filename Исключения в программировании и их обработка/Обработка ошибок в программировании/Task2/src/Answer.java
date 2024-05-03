//Реализуйте метод subArrays, принимающий в качестве аргументов два целочисленных массива a и b,
// и возвращающий новый массив c, каждый элемент которого равен разности элементов двух
// входящих массивов в той же ячейке.

//Если длины массивов не равны - верните нулевой массив длины 1.
//
//Напишите свой код в методе subArrays класса Answer. Метод subArrays принимает на вход два параметра:
//
//int[] a - первый массив
//int[] b - второй массив

public class Answer {
    public static int[] subArrays(int[] a, int[] b){
        int[] c = new int[a.length];
        int[] d = {0};
        if (a.length != b.length) return d;
        else {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        }
    }
}
