import java.util.*;
public class Kaprekarsnumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        
        if(n==1)
        {
            System.out.println("It is a kaprekar number");
        }else
        {
            int sq=n*n;
            int div=10;
            boolean isKaprekar=false;
            while(div<=sq)
            {
                int r=sq%div;
                int l=sq/div;
                if(r>0 && (l+r)==n)
                {
                    isKaprekar=true;
                    break;
                }
                div*=10;
            }
            if(isKaprekar)
            {
                System.out.println("It is a kaprekar number");
            }
            else
            {
                System.out.println("It is not a kaprekar number");
            }
               
    }
    }
}