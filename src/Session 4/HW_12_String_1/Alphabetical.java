import java.util.Scanner;

public class Alphabetical {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str1 = s.next();   
    String str2 = s.next();
    s.close();
    char c1;
    char c2;
    System.out.print("the first string is alphabetically ");
    if (str1.equals(str2)) {
      System.out.println("equal to the second");
    } else {
      for (int i = 0; i < str1.length(); i++) {
        c1 = str1.charAt(i);
        for (int j = 0; j < str2.length(); j++) {
          c2 = str2.charAt(j);
          if (c1 > c2) {
            System.out.print("larger to the second");
            return;
          } else if (c1 < c2) {
            System.out.print("smaller to the second");
            return;
          }
        }
      }
    }
  }
}