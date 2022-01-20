public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        int[][] grid = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[0].length; j++)
            {
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }
}