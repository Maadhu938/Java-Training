import java.util.Scanner;
class spiralmatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for matrix n*n :");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int num = 1; // start filling from 1 to n*n

        int top = 0, bottom = n - 1, left = 0, right = n - 1; 
        // matrix boundaries

       /* We can also use: while(num <= n*n)
          But here we use boundary condition.
          When all values are filled, boundaries cross. */
            
       while(top<=bottom && left<=right)
       {
           // Fill top row (left → right)
           for(int i=left;i<=right;i++)
           {
               matrix[top][i]=num++;
           }
           top++; // move top boundary down

           // Fill right column (top → bottom)
           for(int i=top;i<=bottom;i++)
           {
               matrix[i][right]=num++;
           }
           right--; // move right boundary left

           // Fill bottom row (right → left)
           for(int i=right;i>=left;i--)
           {
               matrix[bottom][i]=num++;
           }
            bottom--; // move bottom boundary up

            // Fill left column (bottom → top)
            for(int i=bottom;i>=top;i--)
            {
                matrix[i][left]=num++;
            }
            left++; // move left boundary right
       }

         for(int i=0;i<n;i++)
         {
              for(int j=0;j<n;j++)
              {
                System.out.print(matrix[i][j]+" ");
              }
              System.out.println();
         }
    }
}