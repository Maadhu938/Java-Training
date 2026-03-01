class Teacher{
    static String Name;
    Teacher(String Name){
        this.Name=Name;
    }
}
class Student{
    static String Name;
    Student(String Name,Teacher teacher){
        this.Name=Name;
    }
}
public class  AssociationDemo{
    public static void main(String args[]){
        Teacher t=new Teacher("Maddy");
        Student s=new Student("bot",t);//why teacher object is passed in student constructor? bcz student is associated with teacher and we want to establish that association by passing teacher object to student constructor
        System.out.println(Student.Name+"is taught by "+Teacher.Name);
    }
}

