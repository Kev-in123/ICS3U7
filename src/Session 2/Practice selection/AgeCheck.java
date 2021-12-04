import java.util.Scanner;

public class AgeCheck {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("What is your age? ");
    int age = s.nextInt();
    s.close();
    if (age >= 18) {
      System.out.println("OLD ENOUGH TO VOTE");
      return;
    }
    System.out.println(18 - age);
  }
}
