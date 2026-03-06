public class WrapperClass {
    public static void main(String[] args) {

        // Autoboxing
        int a = 5;
        Integer num = a;
        System.out.println("Autoboxing: " + num);

        // AutoUnboxing
        int c = num;
        System.out.println("AutoUnboxing: " + c);

        // compareTo
        System.out.println("compareTo: " + num.compareTo(10));

        // equals
        System.out.println("equals: " + num.equals(5));

        // MAX_VALUE
        System.out.println("MAX_VALUE: " + Integer.MAX_VALUE);

        // MIN_VALUE
        System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);

        // parseInt
        num = Integer.parseInt("100");
        System.out.println("parseInt: " + num);

        // toString
        String s = num.toString();
        System.out.println("toString: " + s);
    }
}