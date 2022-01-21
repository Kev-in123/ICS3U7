public class Sum extends ConsoleProgram
{
    
    /*
     * Each sum method has a different method signature
     * At least one of the following is true for any two sum methods:
     * 1. The types of parameters are different
     * 2. The ordering of the parameters are different
     * 3. The total number of parameters are different
     */
    public void run()
    {
        int intValue = 3;
        double doubleValue = 3.0;
        
        int first = sum(intValue, intValue);
        double second = sum(intValue, doubleValue);
        double third = sum(doubleValue, intValue);
        double fourth = sum(doubleValue, doubleValue);
        int fifth = sum(intValue, intValue, intValue);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
    }
    
    public int sum(int one, int two)
    {
        System.out.println("You called int sum(int one, int two)");
        return one + two;
    }
    
    public double sum(int one, double two)
    {
        System.out.println("You called double sum(int one, double two)");
        return one + two;
    }
    
    public double sum(double one, int two)
    {
        System.out.println("You called double sum(double one, int two)");
        return one + two;
    }
    
    public double sum(double one, double two)
    {
        System.out.println("You called double sum(double one, double two)");
        return one + two;
    }
    
    public int sum(int one, int two, int three)
    {
        System.out.println("You called int sum(int one, int two, int three)");
        return one + two + three;
    }
}