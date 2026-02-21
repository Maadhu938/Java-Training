public class swapnumbers{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping using third variable: a = " + a + ", b = " + b);

        //swapping using arithmetic operations
        a = a + b;    
        b = a - b; 
        a = a - b; 

        System.out.println("After swapping using arithmetic operations: a = " + a + ", b = " + b);

        //swapping using bitwise XOR operator
        a = a ^ b;      
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping using bitwise XOR operator: a = " + a + ", b = " + b);

    }

    
}