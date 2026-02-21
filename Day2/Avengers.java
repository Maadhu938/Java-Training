public class Avengers {
    String name;//instance variable
    Avengers(String name){//constructor and local variable
        this.name=name;//left side name is instance variable and right side name is local variable
    }
    void display(){//this is method and its must be called to print the name of avenger
        System.out.println(name);
    }
    public static void main(String[] args) {
        Avengers obj=new Avengers("Iron Man");
        Avengers obj1=new Avengers("Captain America");
        Avengers obj2=new Avengers("Thor");
        obj.display();
        obj1.display();
        obj2.display();
    }
}