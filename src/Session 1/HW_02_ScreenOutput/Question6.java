public class Question6 {
  public static void main(String[] args) {
    System.out.println("Num   Square\n***   ******");
    for (int i = 1; i <= 5; i++) {
      System.out.format("%d\t%d\n", i, i * i);
    }
    System.out.println();
    for (int i = 1; i <= 5; i++) {
      System.out.format("%d*%d=%d", i, i, i * i);
    }
    System.out.println("\t");
  }
}
