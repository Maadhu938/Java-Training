public class evenodd{
    public static void main(String args[]){
        int n=18;
        //using modulus
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        //using lastbinary digit method using bitAnd
        if((n&1)==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
        //using arithmetic method
        if((n/2)*2==n)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}