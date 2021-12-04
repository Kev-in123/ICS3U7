import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = s.nextInt();
    if (isPrime(n)) {
      System.out.println(n + " is a prime number");
    }
    else {
      System.out.println(n + " is not a prime number");
    }
    System.out.print("Enter two numbers: ");
    int a = s.nextInt();
    int b = s.nextInt();
    for (int i = a; i < b; i++) {
      if (isPrime(i)) {
        System.out.println(i);
      }
    }
    s.close();
  }
  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    } else if (n == 1 || (n % 2 == 0)) {
      return false;
    }
    
    int divisors = 0;
    for (int i = 1; i <= (int) Math.sqrt(n); i += 2 ) {
      if (n % i == 0) {
        divisors++;
      }
    }
    return divisors == 1;
  }
}
