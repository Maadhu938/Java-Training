import java.util.Scanner;
class strongnumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        int original=n;
        while(n>0)
        {
          int d=n%10;
          int fact=1;
          for(int i=1;i<=d;i++)
          {
            fact*=i;
          }
          sum+=fact;
          n/=10;
        }
        if(sum==original)
        {
            System.out.println("Strong");
        }
        else
        {
            System.out.println("Weak");
        }
    }
}