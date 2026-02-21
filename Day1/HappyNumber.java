import java.util.Scanner;
public class HappyNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sq=n;
        int count=0;
        while(count<n){
            int sum=0;
            while(sq>0){
                int digit=sq%10;
                sum+=digit*digit;
                sq/=10;
            }
            if(sum==1){
                System.out.println("It is a happy number");
                return;
            }
            sq=sum;
            count++;
        }
        System.out.println("It is not a happy number");
    }
}