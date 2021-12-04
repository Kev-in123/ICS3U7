import java.util.Scanner;

public class Marks {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // initialize 2 arrays of names and marks
    String[] names = new String[4];
    double[] marks = new double[4];
    // prompt the user for names and marks
    for (int i = 0; i < 4; i++) {
      System.out.print("Name " + (i + 1) + ": ");
      names[i] = s.nextLine();
      System.out.print("Mark " + (i + 1) + ": ");
      marks[i] = s.nextDouble();
      s.nextLine();
    }
    // prompt the user for a mark
    System.out.print("Enter a mark: ");
    double mark = s.nextDouble();
    // print the names of students with the mark
    for (int i = 0; i < 4; i++) {
      if (marks[i] == mark) {
        System.out.println(names[i]);
      }
      if (i == 3) {
        System.out.println("Couldn't find the mark specified");
      }
    }
    s.close();
  }
}
