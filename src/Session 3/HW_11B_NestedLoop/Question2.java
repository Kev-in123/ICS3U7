import java.util.Scanner;

public class Question2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter # of rows: ");
    int rows = s.nextInt();
    System.out.print("Enter # of columns: ");
    int columns = s.nextInt();
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    s.close();
  }
}
