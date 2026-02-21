// Method Overloading Example
// Demonstrates compile-time polymorphism

public class OverloadTest {

    // Method to add two integers
    int add(int a, int b){
        System.out.println("Add Integer");
        return a + b;
    }

    // Method to add two double values
    double add(double a, double b){
        System.out.println("Add Double");
        return a + b;
    }

    // Method to add two float values
    float add(float a, float b){
        System.out.println("Add Float");
        return a + b;
    }

    public static void main(String args[]){
        
        // Creating object of OverloadTest class
        OverloadTest o = new OverloadTest();

        // Calls integer version (both arguments are int)
        System.out.println(o.add(5, 10));

        // Calls float version (both arguments are float)
        System.out.println(o.add(5.5f, 10.5f));

        // Calls double version (decimal numbers are double by default)
        System.out.println(o.add(5.5, 10.5));
    }
}