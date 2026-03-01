//case 3.Object Created Inside Method
public class Test{
    void display(){
        Test t1=new Test();
        System.out.println(t1);
    }
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t);
        t.display();
        //4.Anonymous Object
        new Test();
    }
}