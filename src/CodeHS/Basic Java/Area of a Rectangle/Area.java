public class Area extends ConsoleProgram
{
    public void run()
    {
        
        double width = readDouble("width: ");
        double height = readDouble("height: ");
        System.out.println("The area of the rectangle is " + width*height + " units squared.");

    }
}