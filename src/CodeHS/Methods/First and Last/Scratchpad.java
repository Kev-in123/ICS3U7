/* This is the Scratchpad!
This file is not graded, but you can use it to test your code.

You can write and test your method in the Scratchpad, but make
sure to copy and paste it into the Unit Test file before checking
your answer. Remember to only copy and paste the method you want
to submit, not all of your tests.
*/

public class Scratchpad extends ConsoleProgram
{
    public void run()
    {
        // Add your own tests here
        System.out.println(firstAndLast("apple"));
        
    }

    // Copy and paste your Unit Test method here
    public String firstAndLast(String str) {
        return String.valueOf(str.charAt(0)) + String.valueOf(str.length()-1);
    }

}
