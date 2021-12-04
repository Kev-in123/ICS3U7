import java.util.Scanner;

public class Point {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the two radii: ");
    String[] radii = s.nextLine().split(" ");
    System.out.print("Enter the X coordinate of the point: ");
    String xpos = s.next();
    System.out.print("Enter the Y coordinate of the point: ");
    String ypos = s.next();
    double smaller_radius = Math.min(Double.valueOf(radii[0]), Double.valueOf(radii[1]));
    double larger_radius = Math.max(Double.valueOf(radii[0]), Double.valueOf(radii[1]));
    double x = Double.valueOf(xpos);
    double y = Double.valueOf(ypos);
    double distance = calc_distance(x, y);
    if (smaller_radius <= distance && distance <= larger_radius && 0 < x && 0 < y) {
      System.out.format("Your point (%s, %s) lies in the region", xpos, ypos);
    } else {
      System.out.format("Your point (%s, %s) does not lie in the region", xpos, ypos);
    }
    s.close();
  }
  public static double calc_distance(double x, double y) {
    return Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
  }
}