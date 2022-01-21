public class CircleTester extends ConsoleProgram
{
    public void run()
    {
        Circle circle1 = new Circle(50, "green");
        Circle circle2 = new Circle(100);
        Circle circle3 = new Circle("orange");
        Circle circle4 = new Circle();
        
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(circle4);
    }
}