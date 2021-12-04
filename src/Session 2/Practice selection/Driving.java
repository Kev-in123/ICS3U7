import java.util.Scanner;

public class Driving {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("What is your age? ");
    int age = s.nextInt();
    if (age < 18) {
      System.out.println("Too young to drive");
    } else if (age > 75) {
      System.out.println("Sorry you are over the legal age limit for driving");
    } else {
      System.out.println("Age OK. Have you got a driver's license?");
    }
    s.close();
  }
}
