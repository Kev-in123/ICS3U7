import java.util.Scanner;

public class Sum {
  public static void main(String[] args) {
    double sum = 0;
    double num = 0;
    Scanner s = new Scanner(System.in);
    do {
      System.out.print("Enter a number: ");
      num = s.nextDouble();
      sum += num;
    } while (num >= 0);
    System.out.println(sum);
    s.close();
  }
}