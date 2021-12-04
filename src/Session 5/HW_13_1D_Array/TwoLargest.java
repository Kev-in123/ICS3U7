import java.util.Random;

public class TwoLargest {
  public static void main(String[] args) {
    Random random = new Random();
    // Create an array of 10 random integers
    double[] nums = new double[10];
    for (int i = 0; i < 10; i++) {
      nums[i] = random.nextInt(10);
    }
    // Print the array
    for (double i : nums) {
      System.out.println(i);
    }
    System.out.println("---------------------------------");
    // sort the array and print the last 2 values
    nums = sort(nums);
    System.out.println(nums[nums.length - 1]);
    System.out.println(nums[nums.length - 2]);
  }

  public static double[] sort(double[] arr) {
    // initialize length to reduce the number of function calls
    int length = arr.length;
    // create 1 pointer at the beginning of the array
    for (int i = 0; i < length - 1; i++) {
      // initialize the min index
      int min_idx = i;
      // create another pointer right infront of the previous pointer
      for (int j = i + 1; j < length; j++) {
        // compare the 2 values
        if (arr[j] < arr[min_idx]) {
          // update the min index on their size
          min_idx = j;
        }
      }
      // swap the values
      double temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
    // return the array
    return arr;
  }
}
