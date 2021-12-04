import java.util.Scanner;

public class LeastTwoPower {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int number = s.nextInt();
    int power = 1;
    while (power < number) {
      power *= 2;
    }
    System.out.println(power);
    s.close();
  }
}
