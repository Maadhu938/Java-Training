public class CheckedUnchecked{
    public static void  main (String args[]){
        System.out.println("Checked Exception");
        
        System.out.println("IOException");
        System.out.println("FileNotFoundException");
        System.out.println("SQLException");
        System.out.println("ClassNotFoundException");
        System.out.println("InterruptedException");
        System.out.println("InstantiationException");
        System.out.println("IllegalAccessException");
        System.out.println("NoSuchMethodException");
        System.out.println("NoSuchFieldException");
        System.out.println("ParseException");

        System.out.println("--------------------------------------------------");

        System.out.println("Unchecked Exception/RunTime Exception");

        System.out.println("ArithmeticException");
        System.out.println("NullPointerException");
        System.out.println("ArrayIndexOutOfBoundsException");
        System.out.println("ClassCastException");
        System.out.println("IllegalArgumentException");
        System.out.println("IllegalStateException");
        System.out.println("StringIndexOutOfBoundsException");
        System.out.println("NumberFormatException");


    }
}
//Checked exceptions are exceptions that are checked at compile-time. They must be either caught or declared in the method signature using the throws keyword. 
//Unchecked exceptions, also known as runtime exceptions, are exceptions that are not checked at compile-time. They can occur during the execution of the program and do not need to be declared or caught. 