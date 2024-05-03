import java.util.Arrays;

/**
 * напишите метод mergeSort, который принимает массив целых чисел a и
 * реализует алгоритм сортировки слиянием.
 * Метод должен возвращать отсортированный массив.
 * a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */
public class Task1 {
    public static void main(String[] args) {
        int[] a = new int[] { 5, 1, 6, 2, 3, 4 };
        
        int[] res = mergeSort(a);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
            System.out.print(" ");
        }
    }

    public static int[] mergeSort(int[] a) {
        if (a.length < 2)
            return a;

        int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] rihgt = Arrays.copyOfRange(a, left.length, a.length);   
 
        return merge(mergeSort(left), mergeSort(rihgt));
    }

    private static int[] merge(int[] left, int[] rihgt) {
        int[] res = new int[left.length + rihgt.length];
        int resLen = 0, leftLen = 0, rihgtLen = 0;
        while (leftLen < left.length && rihgtLen < rihgt.length) {
            if (left[leftLen] < rihgt[rihgtLen]) {
                res[resLen] = left[leftLen];
                leftLen++;
            } else {
                res[resLen] = rihgt[rihgtLen];
                rihgtLen++;
            }
            resLen++;
        }

        while (resLen < res.length) {
            if (leftLen != left.length) {
                res[resLen] = left[leftLen];
                leftLen++;
            } else {
                res[resLen] = rihgt[rihgtLen];
                rihgtLen++;
            }
            resLen++;
        }
        return res;
    }
}