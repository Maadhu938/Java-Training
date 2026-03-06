public class LinearSearch {
    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;   // return index if found
            }
        }
        return -1;   // return -1 if element not found
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 70;
        int result = LinearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Not found");
        }
    }
}
//Time Complexity: O(n) - In the worst case, we may have to traverse the entire array to find the target element.
//Space Complexity: O(1) - We are using a constant amount of space to store the index and target element.
