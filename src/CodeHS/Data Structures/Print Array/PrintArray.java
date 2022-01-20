public class PrintArray extends ConsoleProgram
{
    public void run()
    {
        String[] arr = new String[]{"a", "b", "c"};
        printArr(arr);
    }
    
    public void printArr(String[] arr)
    {
        // Print everything in the array on its own line
        for (String a: arr) {
            System.out.println(a);
        }
    }
}