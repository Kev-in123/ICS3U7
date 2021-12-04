public class AlternateSerie {
  public static void main(String[] args) {
    double n = 0;
    for (int i = 1; i < 200; i ++) {
      if (i % 2 == 0) {
        n -= 1.0/i;
      } else {
        n += 1.0/i;
      }   
    }
    System.out.format("The Sum of the Series is: %.4f", n);
  }
}
