import java.util.*; // Importing utility classes (Scanner and Arrays)

public class ShiftZeroToEnd { // Class declaration

    public static void main(String[] args) { // Main method where execution starts

        Scanner sc = new Scanner(System.in); // Creating Scanner object to take input

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt(); // Reading the size of the array

        int arr[] = new int[n]; // Creating an array of size n

        System.out.println("Enter the elements of the array: ");

        // Loop to take array elements from the user
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); // Storing each element into the array
        }

        int index = 0; // Pointer to track the position for the next non-zero element

        // Loop to move all non-zero elements to the front
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){ // Check if the element is not zero
                arr[index++] = arr[i]; // Place the non-zero element at index and increment index
            }
        }

        // Fill the remaining positions in the array with zeros
        while(index < n){
            arr[index++] = 0;
        }

        // Print the array after shifting all zeros to the end
        System.out.println(Arrays.toString(arr));
    }
}