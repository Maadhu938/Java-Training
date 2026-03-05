import java.util.*; // Importing all utility classes (used for Arrays.toString)

public class ShiftZerosRight { // Class declaration

    public static void main(String[] args) { // Main method where program execution starts

        int[] arr = {1,0,5,0,2,4}; // Declaring and initializing the array

        int j = 0; // Pointer that indicates the position where the next non-zero element should be placed

        // Loop to traverse each element of the array
        for(int i = 0; i < arr.length; i++){

            // Check if the current element is not zero
            if(arr[i] != 0){

                int temp = arr[i]; // Store current element temporarily

                arr[i] = arr[j]; // Move the element at position j to current index i

                arr[j] = temp; // Place the non-zero element at position j

                j++; // Move j to the next position for the next non-zero element
            }
        }

        // Print the array after shifting all zeros to the end
        System.out.println(Arrays.toString(arr));
    }
}