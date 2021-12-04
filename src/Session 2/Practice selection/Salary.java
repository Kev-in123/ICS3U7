import java.util.Scanner;

public class Salary {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int salary = 1000;
    int commission = s.nextInt();
    commission *= salary * 0.01;
    salary += commission;
    System.out.println(salary);
    s.close();
  }
}
