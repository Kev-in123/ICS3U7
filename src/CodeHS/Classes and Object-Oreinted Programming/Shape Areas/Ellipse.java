public class Ellipse extends Shape
{
    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(String name, double semiMajorAxis, double semiMinorAxis)
    {
        super(name);
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }
    
    public Ellipse(double semiMajorAxis, double semiMinorAxis)
    {
        this("Ellipse", semiMajorAxis, semiMinorAxis);
    }
    
    public double getSemiMajorAxis()
    {
        return semiMajorAxis;   
    }
    
    public double semiMinorAxis()
    {
        return semiMinorAxis;   
    }
    
    public double getArea()
    {
        return Math.PI * semiMinorAxis * semiMajorAxis;
    }
}