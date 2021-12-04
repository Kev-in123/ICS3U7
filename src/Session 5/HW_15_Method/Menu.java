import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Please select from the following menu:" + "\n1. Rectangle Properties" + "\n2. Circle Properties"
        + "\n3. Exit Selection");
    String input = s.nextLine();
    if (input.length() == 1) {
      if (input.charAt(0) == '1') {
        System.out.println("Enter the length and the width");
        int length = s.nextInt();
        int width = s.nextInt();
        System.out.println("The area of the rectangle is " + rectangle(length, width) + " unit(s) squared");
      } else if (input.charAt(0) == '2') {
        System.out.println("Enter the radius");
        int radius = s.nextInt();
        System.out.println("The area of the circle is " + circle(radius) + " unit(s) squared");
      } else if (input.charAt(0) == '3') {
        System.out.println("Thank you for using the program. See you next time!");
        s.close();
        return;
      }
      main(null);
    }
    s.close();
  }

  public static int rectangle(int l, int w) {
    return l * w;
  }

  public static double circle(int r) {
    return r * r * Math.PI;
  }
}
