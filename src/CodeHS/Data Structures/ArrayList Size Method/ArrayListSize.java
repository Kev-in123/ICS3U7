import java.util.*;

public class ArrayListSize extends ConsoleProgram
{
    public void run()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 100; i ++) {
            numbers.add(i);
        }
        
        // Print out the size of the ArrayList.
        System.out.println(numbers.size());
    }
}