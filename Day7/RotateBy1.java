import java.util.*;
public class RotateBy1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        //Declaring an array of size n
        int [] arr = new int [n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();//Taking input for the array
        }
        int last=arr[n-1];//Storing the last element of the array
        //Shifting all elements to the right by one position
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;//Placing the last element at the first position
        System.out.println("Array after rotation: "+Arrays.toString(arr));//Printing the rotated array
    }
}