public class Fibonacci {
  public static void main(String[] args) {
    calculate(3, 4, 6);
  }

  public static void calculate(int start, int start2, int times) {
    int r1 = start;
    int r2 = start2;
    int r = 0;
    System.out.println(r1);
    System.out.println(r2);
    for (int i = 0; i < times - 2; i++) {
      r = r1 + r2;
      r1 = r2;
      r2 = r;
      System.out.println(r);
    }
  }
}
