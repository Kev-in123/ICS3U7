public class Factorial extends ConsoleProgram
{
    public void run()
    {
        int num = readInt("What number would you like to compute the factorial for? ");
        int n = 1;
        for(int i = 1; i < num + 1; ++i) {
            n *= i;
        }
        System.out.println(n);
    }
}