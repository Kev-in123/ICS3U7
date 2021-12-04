import java.util.Scanner;

public class CharToString {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char ch = s.nextLine().charAt(0);
    System.out.println(ch);
    System.out.println(Character.toString(ch));
    s.close();
  }
}
