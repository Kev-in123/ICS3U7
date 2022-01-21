public class StudentTester extends ConsoleProgram
{
    public void run()
    {
        Student alan = new Student("Alan", "Turing", 11);
        Student ada = new Student("Ada", "Lovelace", 12);
        
        System.out.println(alan);
        System.out.println(ada);
    }
}