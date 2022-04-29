import java.util.Scanner;

public class SameSum {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // initialize 2 arrays
    double[] valA = new double[10];
    double[] valB = new double[10];
    // prompt the user
    // one array is filled tieh the absolute value of the input after it is
    // subtracted by 25
    for (int i = 0; i < 10; i++) {
      valA[i] = s.nextDouble();
      valB[i] = Math.abs(valA[i] - 25);
    }
    System.out.println("-------------------------------");
    // print the values in the first array
    System.out.println("valA");
    for (double i : valA) {
      System.out.println(i);
    }
    // print the values in the second array
    System.out.println("valB");
    for (double i : valB) {
      System.out.println(i);
    }
    s.close();
  }
}
