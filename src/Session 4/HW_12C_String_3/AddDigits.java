import java.util.Scanner;

public class AddDigits {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    String digits_str = s.nextLine();
    String num = "";
    int sum = 0;
    for (int i = 0; i < digits_str.length(); i++) {
      sum += Integer.parseInt(String.valueOf(digits_str.charAt(i)));
      num += digits_str.charAt(i) + " + ";
    }
    System.out.println(sum);
    System.out.println("(" + num.substring(0, num.length()-3) + ")");
    s.close();
  }
}