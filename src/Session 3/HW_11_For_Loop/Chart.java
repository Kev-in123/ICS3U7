public class Chart {
  public static void main(String[] args) {
    System.out.println("Square\tCube");
    for (int i = 5; i <= 40; i++) {
      System.out.println(i * i + "\t" + i * i * i);
    }
  }
}
