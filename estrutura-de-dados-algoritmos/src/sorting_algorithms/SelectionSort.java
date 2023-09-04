package sorting_algorithms;

public class SelectionSort {

    public static void selectionSort(int[] array) {

        int selected, smallerPosition, i, j;

        for (i = 0; i < array.length-1; i++) {
            selected = array[i];
            smallerPosition = i+1;
            for (j = i+2; j < array.length; j++) {
                if (array[j] < array[smallerPosition]) smallerPosition = j;
            }

            if (array[smallerPosition] < selected) {
                array[i] = array[smallerPosition];
                array[smallerPosition] = selected;
            }
        }

    }
}
