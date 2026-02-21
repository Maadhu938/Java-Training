import java.util.Scanner;
public class Armstrongnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        int count=0;
        while(n>0)//count the digits in the number
        {
            count++;
            n=n/10;
        }
        n = original;
        while(n>0)
        {
            int d=n%10;
            sum+=Math.pow(d,count);
            n=n/10;
        }        
        if(sum==original)
        {
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }

    }
}