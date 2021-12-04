public class GenerateSet {
  public static void main(String[] args) {
    int n = (int) (Math.random() * 20);
    int m = (int) (Math.random() * (2 - (-6) + 1) + (-6));
    int o = (int) (Math.random() * 6) * 10;
    System.out.println(n + " " + m + " " + o);
  }
}