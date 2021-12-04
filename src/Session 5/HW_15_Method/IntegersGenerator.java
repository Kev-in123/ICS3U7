public class IntegersGenerator {
  public static void main(String[] args) {
    System.out.println(generateInt(-2147483648, 2147483647));
  }

  public static int generateInt(int min, int max) {
    return (int) (Math.random() * (max + 1)) + min;
  }
}
