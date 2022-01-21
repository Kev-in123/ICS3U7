public class CoinFlips extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
        int heads = 0;
        int tails = 0;
        int flip = 0;
        Randomizer r = new Randomizer();   
        
        for (int i = 0; i < FLIPS; i++) {
            if (r.nextInt(1, 4) > 2) {
                System.out.println("Heads");
                heads++;
                continue;
            }
            System.out.println("Tails");
            tails++;
        }
        
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        
        System.out.println("% Heads: " + (heads + 0.0)/(heads + tails));
        System.out.println("% Tails: " + (tails + 0.0)/(heads + tails));
    }
}