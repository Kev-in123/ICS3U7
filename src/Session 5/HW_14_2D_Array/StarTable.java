import java.util.Scanner;

public class StarTable {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int rows = s.nextInt();
    int columns = s.nextInt();
    String[][] stars = new String[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        stars[i][j] = "*";
      }
    }
    for (String[] row : stars) {
      for (String column : row) {
        System.out.print(column);
      }
      System.out.println();
    }
    s.close();
  }
}