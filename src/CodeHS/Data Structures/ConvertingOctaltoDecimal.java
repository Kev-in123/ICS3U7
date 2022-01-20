public class OctalToDecimal extends ConsoleProgram
{
    public void run()
    {
        String octalString = readLine("Input an octal value: ");
        
        int decimalValue = octalToDecimal(octalString);
        
        System.out.println(octalString + " = " + decimalValue);
    }
    
    /* Convert a given octal string
     * into the equivalent decimal value.
     * returns an int representing the decimal value
     * of the octal string
     *
     * Ex: "307"
     * 
     * Number:      3    0    7
     *
     * Place:       8^2  8^1  8^0
     * 
     * Place value: 64   8    1
     * 
     * Compute decimal value: 3*(64) + 0*(8) + 7*(1) = 199
     */
    public int octalToDecimal(String octalString)
    {
        // Get the number of places in this octal number
        int numPlaces = octalString.length();
        
        // Get the current exponent starting with far left
        int currentExponent = numPlaces - 1;
        
        int decimalValue = 0;
        
        // Loop over each character of the octal string
        // and add the value of each place to the decimal value
        for(int i = 0; i < octalString.length(); i++)
        {
            // Get the value of this place (8 ^ current exponent)
            int placeValue = (int) Math.pow(8, currentExponent);
            
            // Get the value of the current octal digit
            char currentDigit = octalString.charAt(i);
            int digitValue = Character.getNumericValue(currentDigit);
            
            // Print out the value at this place
            System.out.print(digitValue + " * (" + placeValue + ")");
            if(i != octalString.length() - 1)
            {
                System.out.print(" + ");
            }
            
            // Add this value to the decimal result
            decimalValue += digitValue * placeValue;
            
            // Decrease the exponent by one for the next place
            currentExponent--;
        }
        
        System.out.println(" = " + decimalValue);
        
        return decimalValue;
    }
}