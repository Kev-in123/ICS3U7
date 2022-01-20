public class FindMinimum extends ConsoleProgram
{
    public void run()
    {
        // Ask the user for three ints and 
        // print out the minimum.
        int num1 = readInt("Enter the first number: ");
        int num2 = readInt("Enter the second number: ");
        int num3 = readInt("Enter the last number: ");
        System.out.println(Math.min(num1, Math.min(num2, num3)));
    }
}