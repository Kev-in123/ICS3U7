public class HailStone2 {
  public static void main(String[] args) {
    int max = max_iterations(1, 60);
    String nums = "";
    for (int i = 1; i <= 200; i++) {
      if (iterations(i) == max) {
        nums += i + " ";
      }
    }
    System.out.println("After inspecting the Hailstone numbers from 1 to 200,");
    System.out.println("The maximum iterations to 4, 2, 1 was: " + max);
    System.out.println("The maximum iterations occurred with initial number of: " + nums);
  }

  public static int iterations(int num) {
    int iterations = 0;
    while (num != 4) {
      if (num % 2 == 0) {
        num /= 2;
      } else {
        num = num * 3 + 1;
      }
      iterations++;
    }
    return iterations + 2;
  }

  public static int max_iterations(int start, int end) {
    int iterations;
    int max = 0;
    for (int i = start; i <= end; i++) {
      iterations = iterations(i);
      if (iterations > max) {
        max = iterations;
      }
    }
    return max;
  }
}

