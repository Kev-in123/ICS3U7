import java.util.Scanner;

public class AddUnicodes {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = s.nextLine();
    int sum = 0;
    for (char ch: input.toCharArray()) {
      sum += ch;
    }
    System.out.println("Sum of Unicodes = " + sum);
    s.close();
  }
}