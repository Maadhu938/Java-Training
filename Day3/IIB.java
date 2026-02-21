public class IIB{
    int runs;
    String name;
    {//this is instance initialization block (IIB)
        System.out.println("This is IIB");
        name="Virat Kohli";
        runs=12000;
    }
    static
    {
        System.out.println("This is static block");
    }
    IIB(){
        System.out.println("inside constructor");
        //name="Virat Kohli";
        //runs=12000;
    }
    void display(){
        System.out.println(name+" "+runs);
    }
    public static void main(String[] args) {
        IIB obj=new IIB();
        obj.display();

        IIB obj1=new IIB();
        obj1.display();
    //iib and constructor can called n times but static block get execute only once

    }

}