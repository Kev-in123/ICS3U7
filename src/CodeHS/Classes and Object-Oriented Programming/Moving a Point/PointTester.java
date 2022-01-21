public class PointTester extends ConsoleProgram
{
    public void run()
    {
        Point p1 = new Point(1, 5);
        System.out.println(p1);
        
        System.out.println("Move p1 by 3, 4");
        p1.move(3, 4);
        System.out.println(p1);
        
        Point p2 = new Point(7, 3);
        System.out.println(p2);
        
        p2.move(1, 2);
        System.out.println("Move p2 by 1, 2");
        System.out.println(p2);

    }
}