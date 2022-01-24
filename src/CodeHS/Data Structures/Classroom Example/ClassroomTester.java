public class ClassroomTester extends ConsoleProgram
{
    public void run()
    {
        Classroom c = new Classroom(10);
        
        Student ada = new Student("Ada", "Lovelace", 12);
        Student alan = new Student("Alan", "Turing", 11);
        c.addStudent(ada);
        c.addStudent(alan);
        c.printStudents();
    }
}