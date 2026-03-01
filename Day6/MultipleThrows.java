public class MultipleThrows{
    static void checkvalues(int num,String text) throws ArithmeticException,NullPointerException{
        if(num<0){
            throw new ArithmeticException("Number cannot be negative");
        }
        if(text==null){
            throw new NullPointerException("Text cannot be null");
        }
        System.out.println("Number: "+num);
        System.out.println("Text: "+text);
    }
    public static void main(String[] args)
    //for two different exceptions we must have two catch blocks.
    //Even though throws has 2 exceptions b
    {
        try{
            checkvalues(-5,"Hello");
        }
        catch(ArithmeticException e){
            System.out.println("Caught ArithmeticException: "+e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Caught NullPointerException: "+e.getMessage());
        }
        finally{
            System.out.println("This block will always be executed");
        }   
    }
}