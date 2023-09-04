package sorting_algorithms;

public class ExampleRun {

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 2, 1, 8};
        int[] nums2 = {5, 8, 3, 1, 4};
        int[] nums3 = {11, 9, 7, 5, 3};
        BubbleSort.bubbleSort(nums);
        InsertionSort.insertionSort(nums2);
        SelectionSort.selectionSort(nums3);

        printArray(nums3);


    }

}
