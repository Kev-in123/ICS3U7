public class Countdown extends ConsoleProgram
{
    public void run()
    {
        countdownFrom(5);
    }
    
    private void countdownFrom(int x)
    {
        // Your code here
        for (int i = x; i > 0; i--) {
            System.out.println(i);
        }
    }
}