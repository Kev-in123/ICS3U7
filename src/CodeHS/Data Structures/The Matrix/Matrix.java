public class Matrix extends ConsoleProgram
{
    public void run()
    {
        // Create a 3x6 grid
        int[][] matrix = new int[3][6];
        printMatrix(matrix);
        
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                // Set each (i, j) position to be the sum of
                // the row and column.
                matrix[i][j] = i + j;
            }
        }
        
        System.out.println();
        
        printMatrix(matrix);
    }
    
    private void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}