public class Main {
    /*
    Написать функцию, возвращающую истину, если в переданном
    массиве есть два соседних элемента, с нулевым значением.
     */
    public static void main(String[] args) {
        int[] arr = {2,0,2,0,1,4};
        System.out.println(checkNeighbours(arr));
    }

    private static boolean checkNeighbours(int[] arr) {
        int i = 0, j = 1;
        while (j < arr.length){
            if (arr[i] == 0 & arr[j] == 0) return true;
            i++;
            j++;
        }
        return false;
    }
}