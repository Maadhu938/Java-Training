import java.util.Scanner;

class tribonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 0, c = 1;

        System.out.println("Tribonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }       
    }
}