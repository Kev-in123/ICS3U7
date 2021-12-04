import java.util.Scanner;

public class Tip {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    //prompt the user
    System.out.print("Enter your grade: ");
    String choice = s.next();
    //all the cases
    switch (choice) {
      case "A":
        System.out.println("Congratulations!");
        break;
      case "B":
        System.out.println("Great job!");
        break;
      case "C":
        System.out.println("You need to study");
        break;
      case "D":
        System.out.println("You need to study");
        break;
      case "F":
        System.out.println("Pay attention in class");
        break;
      default:
        System.out.println("Invalid");
    }
    s.close();
  }
}
