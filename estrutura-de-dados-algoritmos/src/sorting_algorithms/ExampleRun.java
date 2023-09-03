package sorting_algorithms;

public class ExampleRun {

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 2, 1, 8};
        BubbleSort.bubbleSort(nums);
        printArray(nums);
    }

}
