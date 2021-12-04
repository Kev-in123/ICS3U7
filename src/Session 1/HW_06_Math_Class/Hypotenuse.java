import java.util.Scanner;

public class Hypotenuse {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the length of the first side: ");
    double side1 = s.nextDouble();
    System.out.print("Enter the length of the second side: ");
    double side2 = s.nextDouble();
    double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    System.out.format("The hypotenuse is %f", hypotenuse);
    s.close();
  }
}