import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the base: ");
    int b = s.nextInt();
    System.out.print("Enter the exponent: ");
    int e = s.nextInt();
    System.out.format("%d to the power of %d is %.0f", b, e, Math.pow(b, e));
    s.close();
  }
}
