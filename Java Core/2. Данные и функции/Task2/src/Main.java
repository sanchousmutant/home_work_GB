public class Main {
    /*
    Написать функцию, возвращающую разницу между самым большим
    и самым маленьким элементами переданного не пустого массива.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findDiffMaxMin(arr));
    }

    private static int findDiffMaxMin(int[] arr) {
        int max = 0, min = arr[0];
        for (int j : arr) {
            if (max < j) max = j;
            else if (min < j) min = j;
        }
        return max - min;
    }
}