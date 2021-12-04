import java.util.Scanner;

public class Question4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int[] nums = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = 1;
    }
    for (int i = 0; i < size; i++) {
      nums[i] = s.nextInt();
    }
    int temp = nums[0];
    nums[0] = nums[size - 1];
    nums[size - 1] = temp;
    int sampleSum = 0;
    for (int i = 0; i < size; i++) {
      nums[i] = Math.abs(nums[i]);
      sampleSum += nums[i];
    }
    System.out.println("--------------------------------");
    System.out.println(sampleSum);
    System.out.println("--------------------------------");
    for (int i : nums) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    s.close();
  }
}
