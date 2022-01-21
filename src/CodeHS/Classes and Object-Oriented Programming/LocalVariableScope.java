public class LocalScope extends ConsoleProgram
{
    public void run()
    {
        parameterScope("Hello World!");
        System.out.println();
        
        method1();
        method2();
        System.out.println();
        
        forLoopScope();
    }
    
    // The parameter is in scope for the entirety of the method
    public void parameterScope(String parameter)
    {
        System.out.println("parameter exists throughout the entire method");
        System.out.println(parameter);
    }
    
    // The variable `local` in method1 is completely
    // different from the variable `local` in method2
    public void method1()
    {
        // local does not exist yet
        
        String local = "method1's local variable";
        
        // now local exists
        
        System.out.println(local);
    }
    
    // The variable `local` in method1 is completely
    // different from the variable `local` in method2
    public void method2()
    {
        // local does not exist yet
        
        String local = "method2's local variable";
        
        // now local exists
        System.out.println(local);
    }
    
    // Variables declared inside of a for loop only exist inside
    // of the for loop.
    public void forLoopScope()
    {
        System.out.println("i does not exist before the loop.");
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("i exists inside the loop: " + i);
        }
        
        System.out.println("i does not exist after the loop");
    }
}