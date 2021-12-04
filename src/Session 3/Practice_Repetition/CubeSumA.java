import java.util.Scanner;

public class CubeSumA {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = s.nextInt();
    int sum = 0;
    while (n != 0) {
      sum += Math.pow((n % 10), 3);
      n /= 10;
    }
    System.out.println("The cube sum is " + sum);
    s.close();
  }  
}
