import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int gcd = 0;
    System.out.println("Enter two numbers");
    int x = s.nextInt();
    int y = s.nextInt();
    int small = Math.min(x, y);
    for (int i = 1; i <= small; i++) {
      if((x % i == 0) && (y % i == 0)) {
        gcd = i;
      }
    }
    System.out.println("GCD of " + x + " and " + y + " is " + gcd);
    s.close();
  }
}
