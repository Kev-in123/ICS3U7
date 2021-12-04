import java.util.Scanner;

public class Temperature {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("What is the temprature in degrees celsius: ");
    int temprature = s.nextInt();
    if (temprature < -18) {
      System.out.println("Very cold");
    } else if (0 < temprature && temprature <= -18) {
      System.out.println("Cold");
    } else if (temprature == 0) {
      System.out.println("Freezing point of water");
    } else if (0 < temprature && temprature < 10) {
      System.out.println("Very cool");
    } else if (11 < temprature && temprature < 20) {
      System.out.println("Moderate");
    } else if (21 < temprature && temprature < 30) {
      System.out.println("Warm");
    } else if (31 < temprature && temprature < 40) {
      System.out.println("Hot");
    } else if (41 < temprature && temprature < 99) {
      System.out.println("Extremely hot");
    } else if (temprature == 100) {
      System.out.println("Boiling point of water");
    }
    s.close();
  }
}
