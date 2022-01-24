public class SquareTester extends ConsoleProgram
{
    public void run()
    {
        // This line shows us the name of the superclass
        System.out.println(Square.class.getSuperclass().getName());
        System.out.println(Rectangle.class.getSuperclass().getName());

        Square s = new Square(5);
        System.out.println(s);
        System.out.println(s.getArea());
        System.out.println("Side length: " + s.getSideLength());

        Square s2 = new Square(20);
        System.out.println(s2);
        System.out.println(s2.getArea());

    }
}