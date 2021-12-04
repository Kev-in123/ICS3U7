import java.util.Scanner;

public class Count4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    while (n < m + 1) {
      System.out.println(n++);
    }
    s.close();
    }
}
