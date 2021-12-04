import java.util.Scanner;

public class Encryption {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a 7-word message: ");
    String str = s.nextLine();
    while (str.split(" ").length != 7) {
      System.out.println("Invalid number of words");
      System.out.print("Enter a 7-word message: ");
      str = s.nextLine();
    }
    System.out.println(encrypt(str));
    s.close();
  }
  public static String encrypt(String s) {
    String[] str = s.split(" ");
    String word_1 = str[0] + " --> " + word1(str[0]) + "\n";
    String word_2 = str[1] + " --> " + word2(str[1]) + "\n";
    String word_3 = str[2] + " --> " + word3(str[2]) + "\n";
    String word_4 = str[3] + " --> " + word4(str[3]) + "\n";
    String word_5 = str[4] + " --> " + word5(str[4]) + "\n";
    String word_6 = str[5] + " --> " + word6(str[5]) + "\n";
    String word_7 = str[6] + " --> " + word7(str[6]) + "\n";
    String encrypted_1 = word1(str[0]) + " ";
    String encrypted_2 = word2(str[1]) + " ";
    String encrypted_3 = word3(str[2]) + " ";
    String encrypted_4 = word4(str[3]) + " ";
    String encrypted_5 = word5(str[4]) + " ";
    String encrypted_6 = word6(str[5]) + " ";
    String encrypted_7 = word7(str[6]) + " ";
    String message = word_1 + word_2 + word_3 + word_4 + word_5 + word_6 + word_7 + "\n" + s + "\n-> " + encrypted_1
        + encrypted_2 + encrypted_3 + encrypted_4 + encrypted_5 + encrypted_6 + encrypted_7;
    if (encrypted_1.equals("-1 ") || encrypted_6.equals("-1 ") || encrypted_7.equals("-1 ")) {
      System.out.println("Failed to encrypt message\nInvalid number(s) passed/Number(s) passed was too large");
      main(null);
    } else if (encrypted_7.equals("-2 ")) {
      System.out.println("Failed to encrypt message\nCannot find a smaller prime");
      main(null);
    }
    return message;
  }

  public static int word1(String s) {
    if (!isNum(s)) {
      return -1;
    }
    int n = Math.abs(Integer.parseInt(s));
    n = (int) (Math.sqrt(n) + 0.5);
    n = Math.abs(n - 50);
    return n;
  }

  public static String word2(String s) {
    if (!valid(s)) {
      System.out.println("Failed to encrypt message\nInvalid length in 1 or more words");
      main(null);
    }
    if (s.length() <= 3) {
      return s;
    }
    return s.substring(4, s.length()) + s.substring(0, 4);
  }

  public static String word3(String s) {
    if (!valid(s)) {
      System.out.println("Failed to encrypt message\nInvalid length in 1 or more words");
      main(null);
    }
    if (s.length() == 1) {
      return s;
    }
    if (s.length() == 2) {
      return s.substring(1) + s.substring(0, 1);
    }
    int length = s.length();
    String str = "";
    for (int i = 1; i < length - 1; i++) {
      if (Character.toUpperCase(s.charAt(i)) == 'Y' || Character.toUpperCase(s.charAt(i)) == 'Z') {
        str += "Z";
        continue;
      }
      str += (char) (Character.toUpperCase(s.charAt(i)) + 2);
    }
    return s.charAt(s.length() - 1) + str + s.charAt(0);
  }

  public static String word4(String s) {
    if (!valid(s)) {
      System.out.println("Failed to encrypt message\nInvalid length in 1 or more words");
      main(null);
    }
    if (s.length() == 1) {
      return s;
    }
    String str = "";
    char first = s.charAt(0);
    if (!Character.isLetter(first)) {
      str += first;
    } else if (String.valueOf(first).equals(String.valueOf(first).toUpperCase())) {
      str += "$";
    } else {
      str += "&";
    }
    int length = s.length();
    int num = (int) (Math.random() * 10);
    for (int i = 0; i < length - 2; i++) {
      str += num;
    }
    char last = s.charAt(s.length() - 1);
    if (!Character.isLetter(last)) {
      str += last;
    } else if (String.valueOf(last).equals(String.valueOf(last).toUpperCase())) {
      str += "$";
    } else {
      str += "&";
    }
    return str;
  }

  public static String word5(String s) {
    if (!valid(s)) {
      System.out.println("Failed to encrypt message\nInvalid length in 1 or more words");
      main(null);
    }
    return s.replace("n", "xx").replaceFirst("i", "aa");
  }

  public static int word6(String s) {
    if (!isNum(s)) {
      return -1;
    }
    if (s.charAt(0) == '-') {
      s = s.substring(1, s.length());
    }
    return Math.abs((int) Math.pow(10, s.length()) - 30000);
  }

  public static int word7(String s) {
    if (!isNum(s)) {
      return -1;
    }
    int n = Math.abs(Integer.parseInt(s));
    for (int i = n - 1; i > 0; i--) {
      if (isPrime(i)) {
        return Math.abs((int) (Math.sqrt(i) + 0.5));
      }
    }
    return -2;

  }

  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    } else if (n == 1 || (n % 2 == 0)) {
      return false;
    }

    double sqrt = (int) Math.sqrt(n);
    int divisors = 0;
    for (int i = 1; i <= sqrt; i += 2) {
      if (n % i == 0) {
        divisors++;
      }
    }
    return divisors == 1;
  }

  public static boolean isNum(String s) {
    if (s == null || s.equals("")) {
      return false;
    }
    try {
      Integer.parseInt(s);
    } catch (NumberFormatException e) {
      return false;
    }
    return true;
  }

  public static boolean valid(String s) {
    return s.length() > 0;
  }
}