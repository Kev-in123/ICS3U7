import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // initialize 2 arrays
    String[] valA = new String[10];
    String[] valB = new String[10];
    // prompt the user
    // one array is filled from the other end
    for (int i = 0; i < 10; i++) {
      valA[i] = s.nextLine();
      valB[9 - i] = valA[i];
    }
    System.out.println("-------------------------------");
    // print the values
    for (String i : valA) {
      System.out.println(i);
    }
    System.out.println("-------------------------------");
    // print the values in reverse order
    for (String i : valB) {
      System.out.println(i);
    }
    s.close();
  }
}
