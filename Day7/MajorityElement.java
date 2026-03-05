import java.util.Scanner;
public class MajorityElement {
    public static int majority(int arr[], int n) {
        int candidate = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
                if(count == 0) {
                candidate = arr[i];
            }
            if(arr[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
        }
         return candidate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = majority(arr, n);
        System.out.println("Majority Element: " + result);
    }
}