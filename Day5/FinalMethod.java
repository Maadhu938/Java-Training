class parent{
    final void show(){
        System.out.println("Parent class");
    }
}

class child extends parent{
    void show1(){
        System.out.println("Child Class");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        parent p = new child();
        p.show();
    }
    
}
//these are possible errors
//FinalMethod.java:6: error: cannot override show() in parent; overridden method is final