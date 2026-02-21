public class Constructor{
    String name;//instance variable
    Constructor()//this is default constructor 
    {
        System.out.println("This is a default constructor");
    }
    Constructor(String name)//this is parameterized constructor and it will execute when we create object of constructor class by passing argument and it will print 
    {
        this();//invoking default to parametrized
        this.name=name;//this will assign the value of name to instance variable name
    }
    void display(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Constructor obj=new Constructor("Virat Kohli"); 
        obj.display();
    }
}