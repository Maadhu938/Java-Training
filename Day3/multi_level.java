class grandparent{
    void display(){
        System.out.println("I am grandparent");
    }
}
class parent extends grandparent{
    void parentDisplay(){
        System.out.println("I am parent");
    }
}
class child extends parent{
    void childDisplay(){
        System.out.println("I am child");
    }
}
public class multi_level{
    public static void main(String args[]){
        child c=new child();
        parent p=new parent();
        grandparent g=new grandparent();

        c.childDisplay();
        c.parentDisplay();
        c.display();

        p.parentDisplay();
        p.display();

        g.display();
    }
}