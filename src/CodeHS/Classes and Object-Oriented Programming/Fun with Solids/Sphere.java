import java.lang.Math;

public class Sphere extends Solid
{
    // Code goes here!
    double radius;
    public Sphere(String name, double r) {
        super(name);
        radius = r;
    }
    
    public double volume () {
         return (4.0/3.0) * Math.PI * Math.pow(radius,3);
    }
    
    public double surfaceArea () {
         return 4.0 * Math.PI * Math.pow(radius, 2);
    }
}