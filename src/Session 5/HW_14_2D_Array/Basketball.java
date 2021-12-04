public class Basketball {
  public static void main(String[] args) {
    int[][] games = { { 5, 8, 7, 3, 3 }, { 6, 7, 3, 6, 5 } };
    int[] points = new int[2];
    int wins1 = 0;
    int wins2 = 0;
    for (int i = 0; i < 2; i++) {
      wins1 = wins2 = 0;
      for (int j = 0; j < 5; j++) {
        points[i] += games[i][j];
        if (games[0][j] > games[1][j]) {
          wins1++;
        } else if (games[0][j] < games[1][j]) {
          wins2++;
        }
      }
    }
    System.out.println("team 1 points: " + points[0]);
    System.out.println("team 2 points: " + points[1]);
    System.out.println("team 1 wins: " + wins1);
    System.out.println("team 2 wins: " + wins2);

  }
}
