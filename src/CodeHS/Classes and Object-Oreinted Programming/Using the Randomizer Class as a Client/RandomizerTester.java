public class RandomizerTester extends ConsoleProgram
{
    public void run()
    {
        int num = Randomizer.nextInt(100);
        System.out.println(num);
        
        for (int i = 0; i < 100; i++)
        {
            int dieRoll = Randomizer.nextInt(1, 6);
            System.out.println(dieRoll);
        }
        
        if (Randomizer.nextBoolean())
        {
            System.out.println("Coin was heads!");
        }
        else
        {
            System.out.println("Coin was tails!");
        }
    }
}