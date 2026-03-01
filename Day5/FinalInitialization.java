class Final{
    final int x;
    Final(int x){
        this.x = x;
    }

    void display(){
        System.out.println("Value of x is: "+x);
    }
}
public class FinalInitialization {
    public static void main(String[] args) {
        Final f = new Final(5);
        f.display();
    }
    
}