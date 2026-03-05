import java.util.*;

public class RotateByD{
    public static void main(String [] args){

        // Creating Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Asking the user for the size of the array
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        // Declaring an array of size n
        int [] arr = new int[n];

        // Taking array elements as input from the user
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt(); // storing input elements in array
        }

        // Asking how many positions the array should be rotated
        System.out.println("Enter the number of positions to rotate:");
        int d = sc.nextInt();

        // Normalize d if it is greater than the array size
        d = d % n;

        // Creating a temporary array to store rotated elements
        int [] temp = new int[n];

        // Placing elements into new rotated positions
        for(int i = 0; i < n; i++){
            temp[(i + d) % n] = arr[i];
            // (i+d)%n calculates the new index after rotation
        }

        // Printing the rotated array
        System.out.println("Array after rotation: " + Arrays.toString(temp));
    }
}