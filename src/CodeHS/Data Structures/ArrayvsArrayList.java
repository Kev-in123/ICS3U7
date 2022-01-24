import java.util.*;

public class ArraysTester extends ConsoleProgram
{
    public void run()
    {
        // Create and add elements
        String[] arr = new String[5];
        arr[0] = "a";
        arr[1] = "b";
        printArray(arr);
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        printArrayList(list);
        
        // Get elements
        System.out.println("Test getting element at index 1");
        String s1 = arr[1];
        System.out.println(s1);
        
        String s2 = list.get(1);
        System.out.println(s2);
        
        // Set elements
        System.out.println("Test setting element at index 0 to z");

        arr[0] = "z";
        list.set(0, "z");
        
        System.out.println(arr[0]);
        System.out.println(list.get(0));
        
        // Print size or length
        // Note the length of the array is different than the number
        // of elements.
        System.out.println(arr.length);
        System.out.println(list.size());
    }

    private void printArrayList(List<String> list)
    {
        System.out.println("======== Printing ArrayList ========");
        for(String s: list)
        {
            System.out.println(s);
        }
        System.out.println("======== End ArrayList ========");
    }
    
    private void printArray(String[] arr)
    {
        System.out.println("======== Printing Array ========");

        for(String s: arr)
        {
            System.out.println(s);
        }

        System.out.println("======== End ArrayList ========");
    }
}