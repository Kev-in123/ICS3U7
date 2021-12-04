import java.util.Scanner;

public class FoodOrder {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Pick and option from the menu"
    + "\n1) juice, muffin, coffee"
    + "\n2) cereal, toast, milk"
    + "\n3) egg, toast, coffee"
    + "\n4) banana, granola, milk"
    + "\n5) grapefruit, bacon, eggs, coffee");
    int choice = s.nextInt();
    switch (choice) {
      case 1:
        System.out.println("$2.50");
        break;
      case 2:
        System.out.println("$2.50");
        break;
      case 3:
        System.out.println("$3.00");
        break;
      case 4:
        System.out.println("$3.50");
        break;
      case 5:
        System.out.println("$5.00");
        break;
      default:
        System.out.println("Invalid");
      }
    s.close();
  }
}