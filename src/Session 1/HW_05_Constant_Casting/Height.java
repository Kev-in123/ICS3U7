import java.util.Scanner;

public class Height {
  public static void main(String[] args) {
    final float cm_in_inch = 2.54f;
    Scanner s = new Scanner(System.in);
    System.out.print("What is your height in inches: ");
    float height = s.nextFloat();
    System.out.format("Your height in cm is %.2f", cm_in_inch*height);
    s.close();
  }
}
