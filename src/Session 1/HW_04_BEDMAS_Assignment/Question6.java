import java.util.Scanner;

public class Question6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter a diameter in inches: ");
    int diameter = s.nextInt();
    double labour = 0.75;
    double rent = 1.00;
    double materials = 0.05 * diameter * diameter;
    double total = labour + rent + materials;
    System.out.format("The cost of making 1 pizza with a diamater of %d is $%.2f", diameter, total);
    s.close();

  }
}
