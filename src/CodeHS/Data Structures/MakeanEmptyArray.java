public class MakeArray extends ConsoleProgram
{
    public void run()
    {
        int[] arr = new int[5];
        
        // You can see the default values for the int array is 0
        System.out.println(arr[0]);
        System.out.println(arr[3]);
        
        String[] strings = new String[4];
        
        // null is the default value for objects
        System.out.println(strings[0]);
    }
}