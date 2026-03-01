public class ThrowableExample{
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            if(b==0){
                throw new Throwable("Division by zero is not allowed");
                //throw is used to explicitly throw an exception. In this case, we are throwing a Throwable with a custom message when b is zero.
                //Throwable is the superclass of all errors and exceptions in Java. By throwing a Throwable, we can catch it in the catch block and handle it accordingly.
            }
            int result=a/b;
            System.out.println("Result: "+result);

        } //if throw block not followed by catch block then it will give compile time error
        catch (Throwable e) {
            System.out.println("Caught Throwable: "+e.getMessage());
        }
    }
}
/*Throwable has two main subclasses: Exception and Error. 
Exceptions are conditions that a reasonable application might want to catch,
 while Errors are typically conditions that a reasonable application should not try to catch.
 */