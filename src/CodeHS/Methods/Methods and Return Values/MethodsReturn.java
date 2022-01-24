public class MethodsReturn extends ConsoleProgram
{
    public void run()
    {
        int result = sum(2, 5);
        System.out.println(result);
        
        System.out.println(sum(10, 20));
        
        int result2 = sum(100, 35);
        System.out.println(result2);
        
        System.out.println("Testing AddOne Method");
        
        int y = addOne(5);
        System.out.println(y);
        
        System.out.println(addOne(10));
        
        System.out.println("Testing Double Number");
        int doubled = doubleNumber(10);
        System.out.println(doubled);
    }
    
    private int doubleNumber(int x)
    {
        return 2 * x;
    }
    
    private int addOne(int x)
    {
        return x + 1;
    }
    
    private int sum(int a, int b)
    {
        int total = a + b;
        return total;
    }
    
}