import java.util.ArrayList;

public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Add 5 numbers to `numbers`
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        // Print out the first element in `numbers
        System.out.println(numbers.get(0));
    }
}