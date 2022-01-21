public class Circle
{
    private static final double PI = 3.14159265359;
    
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    public double getArea()
    {
        return PI * radius * radius;
    }
    
}