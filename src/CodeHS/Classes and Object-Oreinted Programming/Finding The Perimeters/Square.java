public class Square extends Rectangle
{
    private double side_length;

    public Square(double sideLength)
    {
        super("Square", sideLength, sideLength);
        side_length = sideLength;
    }
    
    public double getSideLength()
    {
        return super.getHeight();
    }
     public double getPerimeter() {
        return side_length * 4;
    }
}