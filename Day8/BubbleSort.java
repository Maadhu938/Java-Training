import java.util.Arrays;

public class BubbleSort {
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 77, 18, 45, 17, 10, 63 };
        System.out.println("Original array" + Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println("sorted array" + Arrays.toString(arr));
   
    }
}