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
        System.out.println(passwordCheck("12345678"));
    }

    
public boolean passwordCheck(String password) {
    if (password.length() < 8) { 
        return false;
    }    
    int count = 1; 
    for (int i = 0; i < password.length() - 1; i++) {
        return !((!Character.isLetterOrDigit(password.charAt(i)) || (Character.isDigit(password.charAt(i)) && ++count < 2)));
    }
    return true;
}
}