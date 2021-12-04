import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter a time in seconds: ");
    int time = s.nextInt();
    int hours = time / 3600;
    int minutes = (time % 3600) / 60;
    int seconds = time % 60;
    System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
    s.close();
  }
}