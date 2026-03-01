public class ThrowBlock{
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            throw new ArithmeticException("This is an exception thrown inside try block");
        }
        catch(ArithmeticException e){
            System.out.println("Caught exception: "+e.getMessage());
            throw new NullPointerException("This is an exception thrown inside catch block");
            //This is known as rethrowing an exception from catch block. When we throw an exception from catch block, it will be caught by the next catch block if there is any. If there is no catch block to catch the exception, then it will be propagated to the caller method.
        }
        finally{
            System.out.println("This block will always be executed");
           // throw new IllegalStateException("This is an exception thrown inside finally block");
            //When we throw an exception from finally block, it will be propagated to the caller method. If there is no caller method to catch the exception, then it will be propagated to the JVM and will cause the program to terminate.
        }
    }
}
