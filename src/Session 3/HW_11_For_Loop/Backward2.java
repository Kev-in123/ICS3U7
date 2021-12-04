import java.util.Scanner;

public class Backward2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number between 50 and 100: ");
    int start = s.nextInt();
    while (start > 100 || start < 50) {
      System.out.print("Enter a number between 50 and 100: ");
      start = s.nextInt();
    }
    for (int i = start; i >= 5; i-=5) {
      System.out.println(i);
    }
    s.close();
  } 
}
