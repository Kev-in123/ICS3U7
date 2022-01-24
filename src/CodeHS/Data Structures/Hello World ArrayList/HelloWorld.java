// Import the ArrayList
import java.util.*;

public class HelloWorld extends ConsoleProgram
{
	public void run()
	{
        // Declare and Create an ArrayList of Strings. 		
		ArrayList<String> myList = new ArrayList<String>();
		
        // Add the element "Hello" to our list 		
		myList.add("Hello");
		// Add the element "World" to our list
		myList.add("World");
		
        // Print the element at index 0 of our list: "Hello" 		
		System.out.println(myList.get(0));
		// Print the element at index 1 of our list: "World" 	
		System.out.println(myList.get(1));
	}
}