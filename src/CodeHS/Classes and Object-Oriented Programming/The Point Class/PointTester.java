public class PointTester extends ConsoleProgram
{
    public void run()
    {
        Point p = new Point(10, 5);
        System.out.println(p);
        p.move(3, 4);
        
        System.out.println(p);
    }
}