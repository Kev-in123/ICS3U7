public class ChocolateChipCookie extends Cookie
{
    private int numberOfChocolateChips;
    
    public ChocolateChipCookie()
    {
        super("Chocolate Chip Cookie", 78);
    }
    
    private void addChocolateChips(int numChips)
    {
        numberOfChocolateChips += numChips;
    }
    
    private int getNumberOfChocolateChips()
    {
        return numberOfChocolateChips;
    }
}