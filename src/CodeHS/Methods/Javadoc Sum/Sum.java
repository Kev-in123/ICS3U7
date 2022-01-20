public class Sum extends ConsoleProgram
{
    public void run()
    {
        System.out.println(sum(2, 5));
    }
    
    /**
     * This returns the sum of two integers.
     *
     * @param x The first integer
     * @param y The second integer
     * @return The sum of the two integers.
     */
    private int sum(int x, int y)
    {
    	return x + y;
    }

}