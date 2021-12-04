import java.util.Scanner;

public class Greet {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String[] input = s.nextLine().split(", ");
    System.out.println("Hello " + input[1] + " " + input[0]);
    s.close();
  }
}