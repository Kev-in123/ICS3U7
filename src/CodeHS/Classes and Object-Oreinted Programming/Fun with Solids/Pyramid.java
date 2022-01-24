import java.lang.Math;

public class Pyramid extends Solid
{
    // Code goes here!
    
    // When testing, values will be passed in this order: length, width, height

    double length;
    double width;
    double height;
    
    public Pyramid (String name, double l, double w, double h) {
        super(name);
        length = l;
        width = w;
        height = h;
    }
    
    public double volume() {
        return length * width * height / 3;
    }
    
    public double surfaceArea() {
        return length * width + Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)) + width * Math.sqrt(Math.pow(length / 2, 2) + Math.pow(height, 2));
    }
}