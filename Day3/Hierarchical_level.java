class parent{
    void display(){
        System.out.println("I am parent");
    }
}

class child1 extends parent{
    void child1Display(){
        System.out.println("I am child1");
    }
}

class child2 extends parent{
    void child2Display(){
        System.out.println("I am child2");
    }
}

public class Hierarchical_level{
    public static void main(String args[]){
        
        child1 c1 = new child1();
        child2 c2 = new child2();
        parent p = new parent();

        c1.child1Display();//neighbour class cannot be accessed by each other but they can access parent class method
        c1.display();//child class can access parent class method

        c2.child2Display();
        c2.display();//child class can access parent class method

        p.display();
        //c1.child2Display(); child1 cannot access child2 method
        //also c2.child1Display(); child2 cannot access child1 method
    }
}