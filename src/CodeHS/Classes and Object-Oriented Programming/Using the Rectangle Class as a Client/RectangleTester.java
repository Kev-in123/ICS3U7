public class RectangleTester extends ConsoleProgram
{
    public void run()
    {
        Rectangle r = new Rectangle(10, 100);
        System.out.println(r.getArea());
        
        // We want to find out which rectangles have the same
        // area as a 50x50 square.
        Rectangle square = new Rectangle(50, 50);
        System.out.println(square.getArea());

        // Loop over rectangles of every length and width
        // from 0 to 500 by fives.
        for(int i = 0; i < 500; i += 5)
        {
            for(int j = 0; j < 500; j += 5)
            {
                Rectangle cur = new Rectangle(i, j);
                if(cur.getArea() == square.getArea())
                {
                    System.out.println(i + " x " + j);
                }
            }
        }
    }
}