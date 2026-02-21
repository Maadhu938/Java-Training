import java.util.*;
class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++)//for number of rows
        {
            for(int j=0;j<=i;j++)//for number of columns which is dependent on the number of rows
            {
                System.out.print("* ");//space is given after * to make the pattern look good
            }       
            System.out.println();
        }
    }
}