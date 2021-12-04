import java.util.Scanner;

public class Bigger {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = s.nextInt();
    System.out.print("Enter the second number: ");
    int b = s.nextInt();
    System.out.format("The larger number is %d", ((a > b) ? a : b));
    s.close();
  }
}
