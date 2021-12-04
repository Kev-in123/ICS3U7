import java.util.Scanner;

public class Height {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // initialize an array of heights
    double[] heights = new double[20];
    for (int i = 0; i < 20; i++) {
      // prompt the user
      heights[i] = s.nextDouble();
    }
    System.out.println("----------------------------------");
    // calculate the average
    double average = average(heights);
    // print the heights above average
    for (double i : heights) {
      if (i > average) {
        System.out.println(i);
      }
    }
    s.close();
  }

  public static double average(double[] heights) {
    int sum = 0;
    // for-each loop
    for (double i : heights) {
      sum += i;
    }
    // return the average
    return sum / heights.length;
  }
}