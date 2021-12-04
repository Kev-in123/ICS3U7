import java.util.Scanner;

public class Guess {
  public static void main(String[] args) {
    int num = (int) (Math.random() * 21) + 1;
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    while(n != num) {
      n = s.nextInt();
    }
    s.close();
  }
}
