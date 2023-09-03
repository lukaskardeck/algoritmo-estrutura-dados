package sorting_algorithms;

public class InsertionSort {

    public static void insertionSort(int[] array) {

        int selected, i, j;

        for (i = 1; i < array.length; i++) {
            selected = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > selected) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = selected;
        }
    }
}
