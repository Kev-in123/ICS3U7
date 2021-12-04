import java.util.Scanner;

public class ChangeHalf {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    System.out.print(str.substring((int) Math.ceil(str.length() / 2)));
    if (str.length() % 2 != 0) {
      System.out.print(str.substring(str.length()/2, str.length()/2 + 1));
    }
    System.out.println(str.substring(0, str.length()/2));
    s.close();
  }
}
