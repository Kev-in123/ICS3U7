public class Circle extends Ellipse
{
    private double radius;
    
    public Circle(double radius)
    {
        super("Circle", radius, radius);
        this.radius = radius;
    }
    
    public double getRadius()
    {
        return radius;   
    }
}