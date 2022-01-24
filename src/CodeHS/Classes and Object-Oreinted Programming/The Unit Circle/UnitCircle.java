public class UnitCircle extends ConsoleProgram
{
    public void run()
    {
        // Write your code here!
        System.out.println("Radians: (cos, sin)");
        for (double i = 0; i < 2 * Math.PI; i += Math.PI/4) {
            System.out.println(i + ": " + Math.cos(i) + ", " + Math.sin(i));
        }
    }
}