import java.util.Scanner;

public class AbsoluteValue {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = s.nextInt();
    System.out.format("The absolute value of %d is %d", number, Math.abs(number));
    s.close();
  }
}
