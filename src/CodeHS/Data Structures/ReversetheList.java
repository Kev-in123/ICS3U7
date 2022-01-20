import java.util.*;

public class ReverseList extends ConsoleProgram
{
    public void run()
    {
        // ArrayList and LinkedList behave the same way for our
        // purposes. The only difference is in how they are implemented
        // under the hood, which may lead to differences in speed
        // and memory efficiency, etc.
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        
        // Build up the lists
        arrayList.add("do");
        arrayList.add("re");
        arrayList.add("mi");
        arrayList.add("fa");
        arrayList.add("so");
        arrayList.add("la");
        arrayList.add("ti");
        arrayList.add("do");
        
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        
        // Print the original lists
        System.out.println("List 1: " + arrayList);
        System.out.println("List 2: " + linkedList);
        
        // Both the arrayList and linkedList can be reversed using our method!
        List<String> reversed1 = reverseList(arrayList);
        List<String> reversed2 = reverseList(linkedList);
        
        System.out.println("Reversed 1: " + reversed1);
        System.out.println("Reversed 2: " + reversed2);
    }
    
    /*
     * Takes a List of Strings as a parameter and returns
     * a new List containing the elements of list in reverse order.
     *
     * Destroys the original list.
     * 
     * This method takes a List<String> as a parameter, so regardless
     * of whether it was passed an ArrayList, LinkedList, etc, we
     * are guaranteed that the methods of the List interface
     * (add, remove, size, etc) will work as intended.
     */
    public List<String> reverseList(List<String> list)
    {
        List<String> reversed = new ArrayList<String>();
        
        while(list.size() > 0)
        {
            // Get the last element of list
            int lastIndex = list.size() - 1;
            String lastElement = list.remove(lastIndex);
            
            // Append it to the new list reversed
            reversed.add(lastElement);
        }
        
        return reversed;
    }
}