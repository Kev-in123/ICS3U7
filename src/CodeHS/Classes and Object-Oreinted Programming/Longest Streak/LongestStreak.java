public class LongestStreak extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
        int heads = 0;
        int streak = 0;
        Randomizer r = new Randomizer();   
        for (int i = 0; i < FLIPS; i++) {
            if (r.nextInt(1, 4) > 2) {
                System.out.println("Heads");
                heads++;
                continue;
            }
            System.out.println("Tails");
            if (heads > streak) {
                streak = heads;
            }
            heads = 0;

        }
        System.out.println("Longest streak of heads: " + streak);
    }
}