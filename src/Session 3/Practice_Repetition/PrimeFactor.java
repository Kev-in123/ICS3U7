import java.util.Scanner;

public class PrimeFactor {
  public static void main(String[] args) {
    int number;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = s.nextInt();
    for(int i = 2; i < number; i++) {
      while(number % i == 0) {
        System.out.print(i + " ");
        number /= i;
      }
    }
    s.close();
  }
}
