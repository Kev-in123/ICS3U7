import java.util.Scanner;

public class AddPairs {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String digits_str = s.nextLine();
    String num = "";
    int sum = 0;
    for (int i = 1; i < digits_str.length(); i += 2) {
      sum += Integer.parseInt(digits_str.substring(i - 1, i + 1));
      num += "" + digits_str.charAt(i - 1) + digits_str.charAt(i) + " + ";
    }
    if (digits_str.length() % 2 == 1) {
      sum += Integer.parseInt(digits_str.substring(digits_str.length() - 1));
      num += digits_str.charAt(digits_str.length() - 1) + " + ";
    }
    System.out.println(out);
    System.out.println(sum);
    System.out.println("(" + num.substring(0, num.length()-3) + ")");
    s.close();
  }
}
