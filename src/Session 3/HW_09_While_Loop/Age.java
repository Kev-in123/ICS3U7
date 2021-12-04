import java.util.Scanner;

public class Age {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    while(n != 14) {
      n = s.nextInt();
    }
    s.close();
  }
}
