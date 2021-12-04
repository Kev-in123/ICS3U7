public class Test {
  public static void main(String[] args) {
    int[][] test = { { 78, 82, 72, 83, 85 }, { 84, 97, 93, 97, 90 }, { 89, 82, 84, 78, 74 }, { 78, 74, 86, 87, 84 },
        { 89, 83, 84, 87, 92 }, { 96, 96, 98, 91, 98 }, { 83, 79, 84, 80, 86 }, { 70, 72, 76, 71, 72 },
        { 82, 89, 84, 84, 81 }, { 93, 87, 97, 91, 93 } };
    double[] average = new double[10];
    for (int i = 0; i < 10; i++) {
      double score = 0;
      for (int j = 0; j < 5; j++) {
        score += test[i][j];
      }
      score /= 5;
      average[i] = score;
    }
    for (double i : average) {
      System.out.println(i);
    }

  }
}
