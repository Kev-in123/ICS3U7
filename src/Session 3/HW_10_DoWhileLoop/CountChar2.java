import java.util.Scanner;

public class CountChar2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int input;
    do {
      input = s.nextInt();
    } while (input > 0);
    s.close();
  }
}
