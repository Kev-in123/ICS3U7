public class CardDeck extends ConsoleProgram
{
    public void run()
    {
        // Introducing nested loops!
        
        // We can use a loop within a loop, or a nested loop,
        // to iterate through every combination of two arrays
        
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Clubs", "Hearts", "Diamonds", "Spades"};
        
        // Outer loop iterates through suits
        System.out.println("Outer loop is iterating through suits: ");
        for(int i = 0; i < suits.length; i++)
        {
            for(int j = 0; j < values.length; j++)
            {
                String suit = suits[i];
                String value = values[j];
                System.out.println(value + " of " + suit);
            }
        }
        
        System.out.println();
        
        // Outer loop iterates through values
        System.out.println("Outer loop is iterating through values");
        for(int i = 0; i < values.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
            {
                String value = values[i];
                String suit = suits[j];
                System.out.println(value + " of " + suit);
            }
        }
    }
}