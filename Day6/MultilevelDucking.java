import java.io.*;
public class MultilevelDucking{

    static void readFile() throws IOException{
        FileReader fr = new FileReader("nonexistentfile.txt");
    }

    static void processFile() throws IOException{
        readFile();
    }
    static void handleFile() throws IOException{
      processFile();
    }
    public static void main(String[] args) {
        try{
            handleFile();
        }
        catch(IOException e){
            System.out.println("Caught exception: "+e.getMessage());
        }
        finally{
            System.out.println("This block will always be executed");
        }
    }
}