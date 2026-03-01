import java.util.Scanner;  // Import Scanner class for user input

public class ArrayIndex {

    // Method to fetch element from array
    // It throws ArrayIndexOutOfBoundsException if index is invalid
    static void fetchElement(int[] a, int index) throws ArrayIndexOutOfBoundsException {
        
        // Check if index is less than 0 OR greater than or equal to array length
        if (index < 0 || index >= a.length) {
            
            // Manually throwing exception with custom message
            throw new ArrayIndexOutOfBoundsException("Index out of bound");
        
        } else {
            
            // If index is valid, print the element at that index
            System.out.println("Element at index " + index + " is: " + a[index]);
        }
    }

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Read size of array
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        // Declare array of size n
        int[] a = new int[n];

        // Take array elements as input
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();   // Store input into array
        }

        // Read index value to fetch
        System.out.println("Enter index to fetch:");
        int index = sc.nextInt();

        try {
            
            // Call method to fetch element
            fetchElement(a, index);

        } catch (ArrayIndexOutOfBoundsException e) {
            
            // Catch block handles invalid index exception
            System.out.println("Caught Exception: " + e.getMessage());

        } finally {
            
            // Finally block always executes
            System.out.println("Program Ended");
        }
    }
}