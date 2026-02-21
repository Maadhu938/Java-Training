public class class_cricketer{
    static{//static block
        System.out.println("Thala");
    }
    void player(){//this is method
        System.out.println("Virat kohli");}

    public static void main(String[] args) {
        System.out.println("RCB");
        class_cricketer obj=new class_cricketer();//here we are creating object of class_cricketer to call player method
        obj.player();
    }
}//output will be thala rcb virat kohli because static block will execute first and then main method will execute and in main method we are calling player method which will print virat kohli