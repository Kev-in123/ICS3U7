public class Grid extends ConsoleProgram
{
    public void run()
    {
        char[][] board = new char[3][3];
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = '-';
            }
        }
        
        board[0][0] = 'X';
        board[1][0] = 'O';
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    
    }
}