import java.util.*; // Importing utility classes like Scanner and Arrays

public class PrefixSum { // Class declaration

    public static void main(String [] args){ // Main method where program starts

        Scanner sc = new Scanner(System.in); // Creating Scanner object to read input
        System.out.println("Enter the size of the array: ");

        int n = sc.nextInt(); // Reading the size of the array

        int [] arr = new int[n]; // Declaring an array of size n

        // Loop to take array elements as input
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); // Storing each input element into the array
        }

        // Loop to calculate prefix sum
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1]; 
            // Adding previous element sum to current element
            // This converts the array into prefix sum array
        }

        // Printing the prefix sum array
        System.out.println(Arrays.toString(arr));
    }
}