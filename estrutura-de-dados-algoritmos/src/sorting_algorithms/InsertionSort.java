package sorting_algorithms;

public class InsertionSort {

    public static void insertionSort(int[] array) {

        int selected, i, j;
        boolean copied;

        for (i = 1; i < array.length; i++) {
            copied = false;
            selected = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > selected) {
                array[j+1] = array[j];
                j--;
                copied = true;
            }
            if (copied) array[j+1] = selected;
        }
    }
}

/*
* laço 1: selected -> 8
* 5 8 3 1 4
*
* laço 2: selected -> 3
* 5 8 3 1 4
* 5 8 8 1 4
* 5 5 8 1 4
* 3 5 8 1 4
*
* laço 3: selected -> 1
* 3 5 8 1 4
* 3 5 8 8 4
* 3 5 5 8 4
* 3 3 5 8 4
* 1 3 5 8 4
*
* laço 4: selected -> 4
* 1 3 5 8 4
* 1 3 5 8 8
* 1 3 5 5 8
* 1 3 4 5 8
*
*
*/
