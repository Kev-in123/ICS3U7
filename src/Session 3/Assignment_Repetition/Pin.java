import java.util.Scanner;

public class Pin {
  public static void main(String[] args) {
    final int password = 1234;
    Scanner s = new Scanner(System.in);
    System.out.print("Please enter your 4-digit pin number: ");
    int input = s.nextInt();
    for (int i = 2; i >= 0; i--) {
      if (input == password) {
        System.out.println("Pin Accepted! Welcome to the system.");
        break;
      } 
      if (i == 0) {
        System.out.println("Wrong pin entered; you have been locked out of the system");
        break;
      }
      if (input != password) {
        System.out.format("Wrong pin entered; you have %d attempt(s) remaining\n", i);
        System.out.print("Please enter your 4-digit pin number: ");
        input = s.nextInt();
      }
    }
    s.close();
  }
}
