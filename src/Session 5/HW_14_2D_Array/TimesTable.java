public class TimesTable {
  public static void main(String[] args) {
    int[][] table = new int[12][12];
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        table[i][j] = (i + 1) * (j + 1);
      }
    }
    for (int i = 0; i < 12; i++) {
      if (i == 0) {
        for (int j = 0; j < 12; j++) {
          System.out.print("\t" + (j + 1));
        }
        System.out.println();
      }
      System.out.print(table[i][0] + "\t");
      for (int j = 0; j < 12; j++) {
        System.out.print(table[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
