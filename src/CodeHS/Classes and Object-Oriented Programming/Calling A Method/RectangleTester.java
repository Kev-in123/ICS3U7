public class RectangleTester extends ConsoleProgram
{
    public void run()
    {
        // Create a rectangle with width 7 and height 14
        Rectangle r = new Rectangle(7, 14);
        // Print out the height
        System.out.println(r.getHeight());
        // Print out the width
        System.out.println(r.getWidth());
        // Print out the area by calling the getArea method
        System.out.println(r.getArea());
    }
}