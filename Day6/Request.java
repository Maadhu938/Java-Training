//requesting for garbage collection
public class Request{
    public static void main(String args[]){
        Request r=new Request();   // Object created
        r=null;                    // Reference removed
        System.gc();               // Request JVM to run Garbage Collector
        System.out.println("Garbage collection requested");
    }
}