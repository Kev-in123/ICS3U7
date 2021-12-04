public class RandomTable {
  public static void main(String[] args) {
    int random_number;
    for (int times = 0; times < 16; times++) {
      if (times % 4 == 0 && times != 0) {
        System.out.println();
      }
      random_number = (int) (Math.random() * 100);
      System.out.print(random_number + " ");
    }
  }
}
