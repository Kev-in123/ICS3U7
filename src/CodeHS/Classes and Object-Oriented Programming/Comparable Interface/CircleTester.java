public class CircleTester extends ConsoleProgram
{
    public void run()
    {
        Circle c1 = new Circle(6);
        Circle c2 = new Circle(6);
        
        System.out.println(c1.compareTo(c2));
        
        Circle c3 = new Circle(12);
        System.out.println(c1.compareTo(c3));
        Circle c4 = new Circle(3);
        System.out.println(c1.compareTo(c4));

        
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        
    }
}