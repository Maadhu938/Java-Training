import java.util.Scanner;
class invertedstarpattern{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)//also we use (i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)//also we use (j=0;j<i;j++)
            {
                System.out.print("* ");//space is given after * to make the pattern look good
            }       
            System.out.println();
        }
    }
}