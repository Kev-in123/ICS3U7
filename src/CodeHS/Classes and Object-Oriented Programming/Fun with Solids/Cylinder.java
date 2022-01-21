import java.lang.Math;

public class Cylinder extends Solid
{
    // Code goes here!
    double radius;
    double height;
    
    public Cylinder(String name, double r, double h) {
        super(name);
        radius = r;
        height = h;
    }
    
    public double volume () {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    public double surfaceArea() {
        return 2 * Math.PI * radius * height + 2* Math.PI * Math.pow(radius, 2);
    }
}