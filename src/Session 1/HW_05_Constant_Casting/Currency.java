import java.util.Scanner;

public class Currency {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter an amount in USD: ");
    double amount = s.nextDouble();
    System.out.format("That is %.2f CAD", amount * 0.99275);
    s.close();
  }
}
