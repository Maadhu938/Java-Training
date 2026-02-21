import java.util.*;

class SnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Fill row from left to right
                for (int j = 0; j < n; j++) {
                    a[i][j] = num++;
                }
            } else {
                // Fill row from right to left
                for (int j = n - 1; j >= 0; j--) {
                    a[i][j] = num++;
                }
            }
        }

        // Print the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
