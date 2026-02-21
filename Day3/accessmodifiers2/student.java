package accessmodifiers2;
import accessmodifiers.person;
public class student extends person{
    public void displayDetails(){
       // person p1 = new person();
        System.out.println("Name: " + name); // Accessing public member from parent class
        System.out.println("Age: " + age);   // Accessing protected member from parent class
       // showname(); // Accessing public method from parent class
        //showAge(); // Accessing protected method from parent class
    }
    public static void main(String[] args) {
        student s = new student();
        s.displayDetails();
    }

}