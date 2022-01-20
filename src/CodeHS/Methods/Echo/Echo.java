public class Echo extends ConsoleProgram
{
    public void run()
    {
        echo("Anybody home?", readInt("Input how many times to echo."));
    }

    private void echo(String text, int numTimes)
    {
        // Your code here.
        for (int i = 0; i < numTimes; i++) {
            System.out.println(text);
        }
    }
}