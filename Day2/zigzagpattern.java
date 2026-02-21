import java.util.*;
public class zigzagpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of columns:");//here we are taking number of columns as input from user because in zigzag pattern number of rows is fixed which is 3 and number of columns is changing based on user input
        int n = sc.nextInt();
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) 
            {
            if ((i==1 && j % 4==3) || (i==2 && j%2==0) || (i==3 && j%4==1)) // condition to print * in zigzag pattern  i is row which is fixed  3 and j is column which is changing from 1 to n and we are using modulus operator to check the condition for printing * in zigzag pattern if the condition is true then we print * else we print space
                { 
                    System.out.print("* ");
                } 
            else 
                {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}