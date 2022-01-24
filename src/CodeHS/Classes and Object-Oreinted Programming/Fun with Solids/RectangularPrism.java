public class RectangularPrism extends Solid
{
    // Code goes here!
    double length;
    double width;
    double height;
    
    public RectangularPrism(String name, double l, double w, double h) {
        super(name);
        length = l;
        width = w;
        height = h;
    }
    
    public double volume () {
        return length * width * height;
    }
    
    public double surfaceArea () {
        return 2 * (length * width + length * height + width * height);
    }
}