public class Sum {
  public static void main(String[] args) {
    double n = 0;
    int m = 17;
    for (int i = 1; i <= m; i ++) {
      n += 1.0/i;
      if (i == 1) {
        System.out.print("1/" + i);
      } else {
        System.out.print(" + 1/" + i);
      }
    }
    System.out.format(" = %.4f", n);
  }
}
