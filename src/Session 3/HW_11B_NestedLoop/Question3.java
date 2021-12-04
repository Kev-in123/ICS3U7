import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter x: ");
    int columns = s.nextInt();
    System.out.print("Enter y: ");
    int rows = s.nextInt();
    for (int i = 0; i < rows; i++) {
      for (int j = 1; j <= columns; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
    s.close();
  }
}
