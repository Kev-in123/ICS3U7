public class Triangle
{
    private double height;
    private double width;
    
    // Write your constructor here!
    public void Triangle(int h, int w) {
        height = h;
        width = w;
    }
    public String toString()
    {
        return "Triangle with width: " + width + " and height: " + height;
    }

}