public class Messages extends ConsoleProgram
{
    public void run()
    {
        // Your code here.
        // Create the two TextMessage objects and print them out.
        TextMessage b = new TextMessage("Bart", "Lisa", "Where are you?");
        TextMessage l = new TextMessage("Lisa", "Bart", "I'm at school!");
        System.out.println(b.toString());
        System.out.println(l.toString());
    }
}