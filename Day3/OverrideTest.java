// Method Overriding Example
// Demonstrates runtime polymorphism using inheritance

class Parent {

    // Method in parent class
    void show() {
        System.out.println("This is Parent class method");
    }
}

class Child extends Parent {

    // Overriding the parent class method
    @Override//shows that this method is overriding the parent class method
    void show() {
        System.out.println("This is Child class method");
    }
}

public class OverrideTest {

    public static void main(String args[]) {

        // Creating parent class object
        Parent p1 = new Parent();
        p1.show();   // Calls Parent version

        // Creating child class object
        Child c = new Child();
        c.show();    // Calls Child version

        // Parent reference holding Child object
        Parent p2 = new Child();
        p2.show();   // Calls Child overriding parent (Runtime Polymorphism)
    }
}