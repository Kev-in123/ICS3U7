public class CardTester extends ConsoleProgram
{
    private static final int HEARTS = 0;
    private static final int DIAMONDS = 1;
    private static final int SPADES = 2;
    private static final int CLUBS = 3;
    
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    private static final int KING = 13;
    private static final int ACE = 14;

    public void run()
    {
        Card twoHearts = new Card(2, HEARTS);
        System.out.println(twoHearts);

        Card aceSpades = new Card(ACE, SPADES);
        System.out.println(aceSpades);
        System.out.println(aceSpades.getValue());
        
        System.out.println(aceSpades.getSuitAsString());
        System.out.println(aceSpades.getRankAsString());
        
        Card nine = new Card(9, DIAMONDS);
        System.out.println(nine);
        
        System.out.println(nine.getRank());
        System.out.println(nine.getValue());
        
        System.out.println("=======");
        
        for(int i = 2; i <= ACE; i++)
        {
            Card c = new Card(i, CLUBS);
            System.out.println(c);
        }
        
        
        
    }
}