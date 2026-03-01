// ==  → compares memory reference (address)
// equals() → compares actual string values (content)

public class StringPool {
    public static void main(String args[]) {

        String s1 = "Ben10";
        String s2 = "Ben10"; 
        // Both s1 and s2 refer to the SAME object in the String Pool

        String s3 = new String("Ben10");
        String s4 = new String("Ben10");
        // new keyword creates a NEW object in Heap memory (outside String Pool)

        System.out.println("s1 == s2 : " + (s1 == s2));
        // true → both refer to same object in String Pool

        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        // true → values are same

        System.out.println("s3 == s4 : " + (s3 == s4));
        // false → different objects in Heap memory

        System.out.println("s3.equals(s4) : " + s3.equals(s4));
        // true → values are same

        System.out.println("s1 == s3 : " + (s1 == s3));
        // false → s1 is in String Pool, s3 is in Heap

        System.out.println("s1.equals(s3) : " + s1.equals(s3));
        // true → values are same

        // intern() method:
        //used to convert heap to string pool
        String s5 = s3.intern();

        System.out.println("s1 == s5 : " + (s1 == s5));
        // true → s5 now refers to the pooled "Ben10"

        System.out.println("s1.equals(s5) : " + s1.equals(s5));
        // true → values are same
    }
}