import java.util.Scanner;

public class Divide17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String n = s.nextLine();
    String n2 = s.nextLine();
    System.out.format("%.2f", Double.parseDouble(n + n2)/17);
    s.close();
  }
}
