package sorting_algorithms;

public class ExampleRun {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print((i == array.length - 1 ? "]\n" : ", "));
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 2, 1, 8};
        int[] nums2 = {5, 8, 3, 1, 4};
        int[] nums3 = {11, 9, 7, 5, 3};
        Sorting.bubbleSort(nums);
        Sorting.insertionSort(nums2);
        Sorting.selectionSort(nums3);

        printArray(nums);
        printArray(nums2);
        printArray(nums3);


    }

}
