public class AddFractions extends ConsoleProgram
{
    public void run()
    {
        int num1 = readInt("What is the numerator of the first fraction? ");
        int den1 = readInt("What is the denominator of the first fraction? ");
        int num2 = readInt("What is the numerator of the second fraction? ");
        int den2 = readInt("What is the denominator of the second fraction? ");
        
        System.out.println("T" + "h" + "e" + " " + "s" + "u" + "m" + " " + "o" + "f" + " " + num1 + "/" + den1 + " " + "+" + " " + num2 + "/" + den2 + " " + "=" + " " + ((num1*den2) + (num2*den1)) + "/" + (den1*den2));
    }
}