public class StudentTester extends ConsoleProgram
{
    public void run()
    {
        Student alan = new Student("Alan", "Turing", 11);
        alan.setGPA(3.5);
        
        System.out.println(alan.getFirstName());
        System.out.println(alan.getGPA());
        
        Student ada = new Student("Ada", "Lovelace", 12);
        
        System.out.println(ada.getFirstName());
        
        System.out.println(alan);
        System.out.println(ada);
    }
}