import java.util.Scanner;

public class ShiftUp {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] n = new int[20];
    for (int i = 0; i < 20; i++) {
      n[i] = s.nextInt();
    }
    int[] m = shift(n);
    for (int i : m) {
      System.out.println(i);
    }
    s.close();
  }

  public static int[] shift(int[] n) {
    int length = n.length;
    int[] m = new int[length];
    for (int i = 0; i < length; i++) {
      m[i] = n[(i + 1) % length];
    }
    return m;
  }
}