class GC extends Exception{
    //This is custom exception.
    public GC(String message){
        super(message);//why super? Because we are calling the constructor of the parent class Exception to set the message of the exception. The message can be retrieved using getMessage() method of the Exception class.
    }
}
public class LibraryDemo{
    static void checkAttendance(boolean absent) throws GC{
        if(absent){
            throw new GC("Penalty to submit 3 books");

        }
        else{
            System.out.println("Present in the class. No penalty");
        }
    }
    public static void main(String[] args) {
        try{
            checkAttendance(true);
        }
        catch(GC e){
            System.out.println("Caught exception: "+e.getMessage());
        }

    }
}