public class HandTester extends ConsoleProgram
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
        Hand h = new Hand();
        Card c = new Card(10, SPADES);
        Card c2 = new Card(5, SPADES);
        
        h.addCard(c);
        h.addCard(c2);
        System.out.println(h);
        System.out.println("Value: " + h.getValue());
        System.out.println("Busted? " + h.busted());
        
        Hand h2 = new Hand();
        Card c3 = new Card(JACK, CLUBS);
        Card c4 = new Card(ACE, HEARTS);
        h2.addCard(c3);
        h2.addCard(c4);
        System.out.println(h2);
        System.out.println(h2.hasBlackjack());
        
        Hand h3 = new Hand();
        h3.addCard(c4);
        h3.addCard(c3);
        h3.addCard(c2);
        System.out.println("=======");
        System.out.println(h3);
        System.out.println(h3.hasBlackjack());
        System.out.println(h3.busted());
        System.out.println(h3.getValue());
        Card ace = new Card(ACE, SPADES);
        h3.addCard(ace);
        
        System.out.println(h3.getValue());
        
        
        
        
        
	}
}