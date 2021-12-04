import java.util.Scanner;

public class CheckInt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //prompt the user
    if (input > 0 && input != 0) {
      System.out.println(input + " is positive");
    } else {
      System.out.println(input + " is negative");
    }
    if (input % 2 == 0) {
      System.out.println(input + " is even");
    } else {
      System.out.println(input + " is odd");
    }
    if (input % 2 == 7) {
      System.out.println(input + " is a multiple of 7");
    } else {
      System.out.println(input + " is not a multiple of 7");
    }
    s.close();
  }
}
