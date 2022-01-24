public class DeckTester extends ConsoleProgram
{
    public void run()
    {
        Deck deck = new Deck();
        System.out.println("Deck before shuffling");
        deck.print();
        
        deck.shuffle();
        System.out.println("Deck after shuffling");
        deck.print();
        
        System.out.println("========");
        
        System.out.println(deck.deal());
        System.out.println(deck.deal());
    }
}