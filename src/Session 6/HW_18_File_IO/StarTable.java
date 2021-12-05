import java.io.*;
import java.util.*;

public class StarTable {
  public static void main(String[] args) {
    String fileName = "star.txt";
    Scanner s = new Scanner(System.in);
    int rows = s.nextInt();
    int columns = s.nextInt();
    try {
      FileWriter file = new FileWriter(fileName);
      BufferedWriter out = new BufferedWriter(file);
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          out.write("*");
        }
        out.write("\n");
      }
      out.close();
    } catch (IOException e) {
      System.out.println("Error");
    }
    s.close();
  }
}
