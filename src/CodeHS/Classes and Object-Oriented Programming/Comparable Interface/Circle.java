public class Circle implements Comparable<Circle>
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    public int compareTo(Circle other)
    {
        double diff = getRadius() - other.getRadius();
        return (int)Math.signum(diff);
    }
    
    public boolean equals(Object other)
    {
        return other instanceof Circle && compareTo((Circle)other) == 0;
    }
    
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public String toString()
    {
        return "Circle with radius: " + radius;
    }
}