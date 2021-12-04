import java.util.Scanner;

public class Numbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // initialize an array of numbers
    double[] nums = new double[6];
    // prompt the user
    for (int i = 5; i >= 0; i--) {
      nums[i] = s.nextDouble();
    }
    System.out.println("----------------------------------");
    // print the numbers
    for (double i : nums) {
      System.out.println(i);
    }
    System.out.println("----------------------------------");
    // increase by 10%
    for (int i = 0; i <= 5; i++) {
      nums[i] *= 1.1;
    }
    // print the numbers larger than 50
    for (double i : nums) {
      if (i > 50) {
        System.out.println(i);
      }
    }
    s.close();
  }
}
