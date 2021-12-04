public class CubeSumB {
  public static void main(String[] args) {
    String nums = "";
    int n;
    for (int i = 10; i <= 9999; i++) {
      nums = "";
      n = i;
      if (cubeSum(i) == i) {
        while (n != 0) {
          nums += n % 10 + "\u00b3 + ";
          n /= 10;
        }
        System.out.println(i + " is one of them as " + i + " = " + nums);
      }
    }
  }  
  public static int cubeSum(int n) {
    int sum = 0;
    while (n != 0) {
      sum += Math.pow((n % 10), 3);
      n /= 10;
    }
    return sum;
  }
}
