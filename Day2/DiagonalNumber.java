import java.util.Scanner;

class DiagonalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of matrix (n x n):");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int num=1;
        for (int d = 0; d < 2 * n - 1; d++) {
            int row = d < n ? d : n - 1;
            int col = d < n ? 0 : d - n + 1;

            while (row >= 0 && col < n) {
                arr[row][col] = num++;
                row--;
                col++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
         }
        System.out.println();
    }

    }
}