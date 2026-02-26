import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.println("Enter a string:");

        // nextLine() reads full sentence (including spaces)
        String input = sc.nextLine();

        // 1. length() → counts total characters
        System.out.println("Length of the string: " + input.length());
        
        // 2. toUpperCase() → converts to CAPITAL letters
        System.out.println("String in uppercase: " + input.toUpperCase());
        
        // 3. toLowerCase() → converts to small letters
        System.out.println("String in lowercase: " + input.toLowerCase());
        
        // 4. charAt(index) → gets character at given position
        System.out.println(input.charAt(2)); 
        
        // 5. substring(start, end) → gets part of string
        System.out.println(input.substring(0,4));
        
        // 6. concat() → joins two strings
        String str = "Cannon Bolt";
        System.out.println("concat:" + input.concat(str));

        // + operator can also join strings
        System.out.println(input + str);
        
        // 7. equals() → checks exact match (case sensitive)
        System.out.println(input.equals("Ben 10"));
        
        // 8. equalsIgnoreCase() → checks match (ignores case)
        System.out.println(input.equalsIgnoreCase("ben 10"));
        
        // 9. replace(old, new) → replaces text
        System.out.println(input.replace("10","14"));
        
        // 10. trim() → removes extra spaces at start and end
        String spaced = " " + input + " ";
        System.out.println("Trimmed string: " + spaced.trim());

        // 11. startsWith() → checks if string starts with given text
        System.out.println(input.startsWith("B"));

        // 12. endsWith()   → checks if string ends with given text
        System.out.println(input.endsWith("n"));

        // 13. indexOf() → finds position of first occurrence
        System.out.println(input.indexOf("e"));

        // 14. compareTo() → compares two strings lexicographically
        System.out.println(input.compareTo("Ben 10")); // 0 if equal, negative  if input < "Ben 10", positive if input > "Ben 10"

        // 15. split() → splits string into array based on delimiter
        String[] words = input.split(" ");
        for(String word: words){
            System.out.println(word);
        }
        // 16. isLetter() and 17 . isDigit() → checks if character is a letter or digit
        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(Character.isLetter(c)){
                System.out.println(c + " is a letter");
            } else if(Character.isDigit(c)){
                System.out.println(c + " is a digit");
            } else {
                System.out.println(c + " is neither a letter nor a digit");
            }
        }
    }
}