import java.util.Scanner;

public class Encrypt {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a line to be encrypted: ");
    String[] str = s.nextLine().split(" ");
    for (String i: str) {
      System.out.print(encrypt(i) + " ");
    }   
    s.close();
  }

  public static String encrypt(String str) {
    if (str.length() == 1) {
      return str;
    }
    if (str.length() == 2) {
      return  str.substring(1) + str.substring(0, 1);
    }
    String out = "";
    out += str.charAt(str.length() - 1);
    for (int i = 1; i < str.length() - 1; i++) {
      out += (char) (str.charAt(i) + 2);
    }
    out += str.charAt(0);
    return out;
  }
}
