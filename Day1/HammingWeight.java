import java.util.*;
public class HammingWeight {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;//remove the last bit of the number by right shifting it by 1 position
        }
        System.out.println("Hamming weight: "+count);//count of set bits in the binary representation of the number
    }
}