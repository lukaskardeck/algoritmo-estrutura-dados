package sorting_algorithms;

public class Sorting {

    public static void bubbleSort(int[] array) {

        int aux;
        boolean reversed;

        do {
            reversed = false;

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    reversed = true;
                }
            }
        } while (reversed);

    }


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
