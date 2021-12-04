public class SelfReverse {
  public static void main(String[] args) {
    // initialize an array
    int[] nums = { 1, 2, 3, 4, 5 };
    // call the reverse() method
    nums = reverse(nums);
    // print the values in the array
    for (int i : nums) {
      System.out.println(i);
    }
  }

  public static int[] reverse(int[] nums) {
    // initialize length to reduce the number of function calls
    int length = nums.length;
    // initialize a new array
    int[] _nums = new int[length];
    // loop through the array
    for (int i = 0; i < length; i++) {
      // assign the value at the end of the array to the new array
      _nums[length - 1 - i] = nums[i];
    }
    // return the new array
    return _nums;
  }
}
