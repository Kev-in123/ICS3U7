public class ComparingRectangles extends ConsoleProgram
{
    public void run()
    {
        // We can compare primitives with ==
        int x = 5;
        int y = 5;
        if(x == y)
        {
            System.out.println(x + " is equal to " + y);
        }
        
        // But we cannot compare objects with ==
        // Comparing with == compares memory addresses, 
        // NOT the actual object content
        Rectangle one = new Rectangle(5, 10);
        Rectangle two = new Rectangle(5, 10);
        
        if(one == two)
        {
            System.out.println(one + " == " + two);
        }
        
        // We CAN compare objects using .equals
        // IF the .equals method has been implemented
        // Otherwise .equals has the same behavior as ==
        if(one.equals(two))
        {
            System.out.println(one + " is equal to " + two);
        }
    }
}