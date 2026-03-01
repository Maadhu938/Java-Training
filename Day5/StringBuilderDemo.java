//sb -> it is object of string builder class
//used to create mutable strings (can be modified after creation)
import java.util.Scanner;
public class StringBuilderDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");// Ben10
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        //append()
        sb.append("Alien Force");
        System.out.println(sb); // Ben10Alien Force

        //insert()
        sb.insert(0,"XLR8 ");
        System.out.println(sb); // XLR8 Ben10Alien Force

        //delete()
        sb.delete(0,5);
        System.out.println(sb); // Ben10Alien Force

        //replace()
        sb.replace(3,7,"UltimateAlien");
        System.out.println(sb); // BenUltimateAlien Force

        //reverse()
        sb.reverse();
        System.out.println(sb); // ecroF ninemAetamitlUneB
    }
}