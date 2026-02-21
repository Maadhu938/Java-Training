package accessmodifiers;

public class person{
    public String name="Maddy";
    protected int age=22;
    public void showname(){
        System.out.println("Name: " + name);
    }
    protected void showAge(){
        System.out.println("Age: " + age);
    }
}