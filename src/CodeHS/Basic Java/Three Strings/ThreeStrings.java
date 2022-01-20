public class ThreeStrings extends ConsoleProgram
{
    public void run()
    {
        // Ask the user for three strings.
        // remember to use the readLine() method.
        String one = readLine("First string? ");
        String two = readLine("Second string? ");
        String three = readLine("Third string? ");
        if ((one + two).equals(three)) {
            System.out.println(one + " + " + two + " is equal to " + three + "!");
            return;
        }
        System.out.println(one + " + " + two + " is not equal to " + three + "!");

    }
}