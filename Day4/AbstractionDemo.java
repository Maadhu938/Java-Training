// Abstract class (cannot create object directly)
abstract class Hero {

    private String name;  // variable to store hero name

    // Constructor to initialize hero name
    public Hero(String name) {
        this.name = name;
    }

    // Normal method to return hero name
    public String getName() {
        return name;
    }
    // Abstract method (no body)
    // Child classes must implement this
    abstract void power();

    // Static method (belongs to class, not object)
    public static void information() {
        System.out.println("Marvel Superheroes");
    }
}

// Child class that extends Hero
class Ironman extends Hero {

    // Constructor to pass name to parent class
    public Ironman(String name) {
        super(name);  // calling parent constructor
    }

    // Implementing abstract method
    @Override
    void power() {
        System.out.println(getName() + " has a jarvis and a powerful suit of armor.");
    }
}

// Main class
public class AbstractionDemo {

    public static void main(String[] args) {

        // Calling static method using class name
        Hero.information();

        // Creating object of child class
        // (Cannot create object of abstract class)
        Hero hero1 = new Ironman("Tony Stark");

        // Calling overridden method
        hero1.power();
        //hero1.getName(); // We can call normal method from abstract class
    }
}