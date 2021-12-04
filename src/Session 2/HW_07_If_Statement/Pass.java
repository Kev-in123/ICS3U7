import java.util.Scanner;

public class Pass {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num1 = (int) (Math.random() * 100);
    int num2 = (int) (Math.random() * 100);
    int answer = num1 + num2;
    System.out.format("What is %s + %s? ", num1, num2);
    int userAnswer = s.nextInt();
    if (userAnswer != answer) {
      System.out.print("Incorrect.");
    } else {
      System.out.println("Correct!");
    }
    s.close();
  }
}
