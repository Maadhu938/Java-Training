class RatMaze {

    static int N = 4;

    static boolean solveMaze(int maze[][], int x, int y, int sol[][]) {

       //Here we are checking if we have reached the destination cell (N-1, N-1) and if it is a valid path (value is 1). If so, we mark it as part of the solution and return true to indicate that a solution has been found.
        if (x == N-1 && y == N-1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
//here we are checking if the current cell (x, y) is a valid path (value is 1) and within the bounds of the maze. 
/* If it is valid, we mark it as part of the solution and recursively explore two possible paths: moving down (x+1, y) and moving right (x, y+1). 
If either of these recursive calls returns true, we propagate that success back up the call stack.
 If neither path leads to a solution, we unmark the cell (backtrack) and return false to indicate that this path does not lead to a solution. */
        if (x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1) {

            sol[x][y] = 1;
//Move down
            if (solveMaze(maze, x+1, y, sol))
                return true;
//Move right
            if (solveMaze(maze, x, y+1, sol))
                return true;

            sol[x][y] = 0;   // backtrack
            return false;
        }

        return false;
    }

    static void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(sol[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };

        int sol[][] = new int[N][N];

        if (solveMaze(maze,0,0,sol))
            printSolution(sol);
        else
            System.out.println("No solution");
    }
}
/*Steps:
1. Start from the top-left corner of the maze.
2. Move towards the bottom-right corner.
3. At each cell, check if it's a valid path (value is 1).
4. If the cell is valid, mark it as part of the solution.
5. Recursively explore all possible paths.
6. If a path leads to the destination, print the solution.
7. If no path is found, print "No solution".*/

/*Backtracking:
1. If a path does not lead to the destination, unmark the cell (backtrack) and explore other paths.
2. This allows the algorithm to explore all possible paths without getting stuck in a dead end.*/