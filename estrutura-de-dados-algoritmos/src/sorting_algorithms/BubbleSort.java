package sorting_algorithms;

public class BubbleSort {

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

}
