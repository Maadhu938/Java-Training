class parent{
    void display(){
        System.out.println("This is the parent class");
    }
}
class child extends parent{
    void childDisplay(){
        System.out.println("This is the child class");
    }
}
public class single_level {
    public static void main(String[] args) {
    child c = new child();
    c.childDisplay();
    c.display();//child class can access parent class method here overriding is not done so it will call parent class method
    parent p = new parent();
    p.display();
    //p.childDisplay();        parent class cannot access child class method
}  
}