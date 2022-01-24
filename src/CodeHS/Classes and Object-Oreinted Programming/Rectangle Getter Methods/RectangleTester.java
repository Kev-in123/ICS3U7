public class RectangleTester extends ConsoleProgram
{
    public void run()
    {
        /*
         * Rectangle is the name of the class. Every Rectangle
         * has a width and a height. But the specific instances
         * have their own dimensions.
         */
         Rectangle r1 = new Rectangle(10, 2);
         System.out.println(r1);
         
         // Access the height of r1
         System.out.println("r1 height: " + r1.getHeight());
         
         // Rectangle is the class and also the type of this object.
         Rectangle r2 = new Rectangle(5, 15);
         System.out.println(r2);
         
         // Access the width of r2
         System.out.println("r2 width: " + r2.getWidth());
    }
}