public class HailStone1 {
  public static void main(String[] args) {
    int n;
    int last_num;
    System.out.println("1 will reach this cycle.");
    for (int i = 1; i <= 200; i++) {
      n = i;
      while (n != 1) {
        if (n % 2 == 0) {
          n /= 2;
        } else {
          n = n * 3 + 1;
        }
        last_num = n;
        if (last_num == 1) {
          System.out.println(i + " will reach this cycle.");
        }
      }
    }
  }
}
