public class Test1{
    public static void main(String[] args) {
       Test1 t1 = new Test1();
       System.out.println(t1);
       //case1:Nullifying the reference variable
       /* t1=null;
       System.out.println(t1); */
         //case2:Reassigning the reference variable
         t1=new Test1();
         System.out.println(t1); //Address of the new object is different from the previous one. The previous object is eligible for garbage collection. 
    }
}