public class ClassroomTester extends ConsoleProgram
{
    public void run()
    {
        Classroom c = new Classroom(2);
        
        Student ada = new Student("Ada", "Lovelace", 12);
        ada.addExamScore(44);
        ada.addExamScore(65);
        ada.addExamScore(77);

        Student alan = new Student("Alan", "Turing", 11);
        alan.addExamScore(38);
        alan.addExamScore(24);
        alan.addExamScore(31);

        // add students to classroom
        c.addStudent(ada);
        c.addStudent(alan);
        c.printStudents();
        
        Student topStudent = c.getTopStudent();
        System.out.println(topStudent);
    }
}