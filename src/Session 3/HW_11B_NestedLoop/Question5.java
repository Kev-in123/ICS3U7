import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for (int i = 1; i < n; i++) {
      for (int j = 1; j < i; j++) {
        if (i * i + j * j <= n * n && is_pythagorean(i, j)) {
          System.out.println(j + "\u00b2 + " + i + "\u00b2 = " + (int) Math.sqrt(i * i + j * j) + "\u00b2");
        }
      }
    }
    s.close();
  }
  public static boolean is_pythagorean(int m, int n) {
    return Math.sqrt(m * m + n * n) == (int) Math.sqrt(m * m + n * n);
  }
}

