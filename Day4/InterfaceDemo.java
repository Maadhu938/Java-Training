// Interface defines rules that a class must follow
interface Human {

    // Abstract method (no body)
    // Any class implementing Human must define this method
    void power();

    // Default method (introduced in Java 8)
    // Provides a ready-made implementation
    default void identify() {
        System.out.println("Gangadhar is Shaktiman");
    }
}

// Class implementing the Human interface
class Shaktiman implements Human {

    // Implementing the abstract method
    // Must be public
   // @Override 
    public void power() {
        System.out.println("Five elements power");
    }
}

// Main class
public class InterfaceDemo {

    public static void main(String[] args) {

        // Creating object using interface reference
        // This shows runtime polymorphism
        Human h1 = new Shaktiman();

        // Calling implemented method
        h1.power();

        // Calling default method from interface
        h1.identify();
    }
}