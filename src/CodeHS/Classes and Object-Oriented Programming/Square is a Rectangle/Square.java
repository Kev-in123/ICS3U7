public class Square extends Rectangle
{
    public Square(int sideLength)
    {
        super(sideLength, sideLength);
    }
    
    public int getSideLength()
    {
        return super.getHeight();
    }
    
    // Override toString in the subclass
    public String toString()
    {
        return "Square with side length: " + getHeight();
    }
    
}