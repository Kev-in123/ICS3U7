public class MathDemos extends ConsoleProgram
{
    public void run()
    {
        // Note here these are all static methods called on
        // the Math class, not an instance. You can tell that
        // because we never made an object of the Math class
        // with the keyword new.
        int x = Math.abs(-5);
        System.out.println("Absolute value of -5: " + x);
        
        double cos0 = Math.cos(0);
        System.out.println("Cosine of 0: " + cos0);
        
        double squared = Math.pow(10, 2);
        System.out.println("10^2 = " + squared);
        
        double cubed = Math.pow(9, 3);
        System.out.println("9^3 = " + cubed);
        
    }
}