public class Palindromes extends ConsoleProgram
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public void run()
    {
        String text = readLine("Type in your text: ");
        if(isPalindrome(text))
        {
            System.out.println("Your word is a palindrome!");
        }
        else
        {
            System.out.println("Not a palindrome :(");
        }
    }
    
    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    private boolean isPalindrome(String text)
    {
        String reversed = reverse(text);
        if(text.equals(reversed))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    private String reverse(String text)
    {
        String result = "";
        for(int i = text.length() - 1; i >= 0; i--)
        {
            char cur = text.charAt(i);
            result += cur;
        }
        return result;
    }
    

}