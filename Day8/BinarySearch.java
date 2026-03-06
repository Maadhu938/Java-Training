public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 5, 7, 9, 11 };
        int target = 9;
        System.out.println(binarySearch(arr, target));
    }
}