import java.util.Scanner;

public class Character {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str[] = s.nextLine().split("");
    for (String i: str) {
      System.out.println(i);
    }
    s.close();
  }
}
