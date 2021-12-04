import java.util.Scanner;

public class DigitDisplay {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int n = s.nextInt();
    while (n != 0) {
      System.out.println(n % 10);
      n /= 10;
    }
    s.close();
  }
}
