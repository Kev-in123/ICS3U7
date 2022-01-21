public class ShapesTester extends ConsoleProgram
{
    public void run()
    {
        Shape rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getName());
        System.out.println(rectangle.getArea());
        
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println(r2.getName());
        System.out.println(r2.getArea());
        
        Shape circle = new Circle(10);
        System.out.println(circle.getName());
        System.out.println(circle.getArea());
        
        Shape ellipse = new Ellipse(5, 4);
        System.out.println(ellipse.getName());
        System.out.println(ellipse.getArea());
        
        Shape square = new Square(6);
        System.out.println(square.getName());
        System.out.println(square.getArea());
        
    }
}