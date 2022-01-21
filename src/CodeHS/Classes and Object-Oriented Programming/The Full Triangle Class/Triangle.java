public class Triangle
{
    private int height;
    private int width;
    public Triangle(int w, int h) {
        height = h;
        width = w;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public double getArea() {
        return (height * width + 0.0) / 2;
    }
    
}