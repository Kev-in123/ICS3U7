public class StudentTester extends ConsoleProgram
{
    public void run()
    {
        // Student is the name of the class
        
        // These variables named `alan` and `ada` are
        // objects, or "instances of the class"
        Student alan = new Student("Alan", "Turing", 11);
        Student ada = new Student("Ada", "Lovelace", 12);
        
        System.out.println(alan);
        System.out.println(ada);
    }
}