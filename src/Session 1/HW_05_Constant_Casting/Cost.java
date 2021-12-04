import java.util.Scanner;

public class Cost {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("What is the price of the item? ");
    double price = s.nextDouble();
    final double hst = 0.13;
    System.out.format("The total tax payed is %.2f and the total price payed is %.2f", hst*price, hst*price+price);
    s.close();
  }
}