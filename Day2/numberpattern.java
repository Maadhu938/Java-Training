import java.util.*;
class numberpattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(i+1+" ");//why i+1 because we want to start the pattern from 1 and not from 0 as i starts from 0 and goes till n-1 if we just add i then it prints 0 in the first row and we want to print 1 in the first row so we add 1 to i to get the desired output
            }       
            System.out.println();
        }
    }
}