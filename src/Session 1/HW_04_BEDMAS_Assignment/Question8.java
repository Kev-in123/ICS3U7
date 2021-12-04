import java.util.Scanner;

public class Question8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a 3-digit number: ");
    int num = s.nextInt();
    int sum = num / 100 + num / 10 % 10 + num % 10;
    System.out.println("Sum of the digits: " + sum);
    s.close();
  }
}
