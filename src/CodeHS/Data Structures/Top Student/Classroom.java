public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getTopStudent()
    {
        Student top = students[0];
        
        
        for(int i = 0; i < numStudentsAdded; i++)
        {
            if(top.getAverageScore() < students[i].getAverageScore())
            {
                top = students[i];
            }
        }
        return top;
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}