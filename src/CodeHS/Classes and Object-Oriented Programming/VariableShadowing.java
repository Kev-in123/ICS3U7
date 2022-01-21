public class VariableShadowing extends ConsoleProgram
{
    private String name = "Instance Variable";
    
    public void run()
    {
        printInstanceVar();
        printLocalVar();
        printParameter("Parameter");
    }
    
    // Inside this method, name refers to the
    // instance variable name
    public void printInstanceVar()
    {
        System.out.println(name);
    }
    
    // Inside this method, name refers to the
    // local variable name
    public void printLocalVar()
    {
        String name = "Local Variable";
        System.out.println(name);
    }
    
    // Inside this method, name refers to the
    // parameter name
    public void printParameter(String name)
    {
        System.out.println(name);
    }
}