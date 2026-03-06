import java.util.*;
public class SelectionSort {
    public static void Selectionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]){
    int arr[] = { 77, 18, 45, 17, 10, 63 };
    System.out.println("Original array" + Arrays.toString(arr));
    Selectionsort(arr);
    System.out.println("sorted array"+Arrays.toString(arr));
}
}