
/**
 * Encryption.java
 * 2021-11-12
 * v12
 * This program ecrypts a message
 */
import java.util.Scanner;

public class Encryption {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // prompt the user
    System.out.print("Enter a 7-word message: ");
    String str = s.nextLine();
    // check the length of the string
    while (str.split(" ").length != 7) {
      // output a corresponding message it the length is not 7
      System.out.println("Invalid number of words");
      // prompt the user again
      System.out.print("Enter a 7-word message: ");
      str = s.nextLine();
    }
    // output the encrypted message
    System.out.println(encrypt(str));
    s.close();
  }

  /**
   * encrypts the message
   * 
   * @param s
   * @return the encrypted message
   */
  public static String encrypt(String s) {
    // split the string into an array of words
    String[] str = s.split(" ");
    // encrypt the words for the output
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
    // a string to hold the encrypted message
    String message = word_1 + word_2 + word_3 + word_4 + word_5 + word_6 + word_7 + "\n" + s + "\n-> " + encrypted_1
        + encrypted_2 + encrypted_3 + encrypted_4 + encrypted_5 + encrypted_6 + encrypted_7;
    // if the encyption fails for the numbers, output a corresponding message
    if (encrypted_1.equals("-1 ") || encrypted_6.equals("-1 ") || encrypted_7.equals("-1 ")) {
      System.out.println("Failed to encrypt message\nInvalid number(s) passed/Number(s) passed was too large");
      // re-prompt
      main(null);
    } else if (encrypted_7.equals("-2 ")) {
      System.out.println("Failed to encrypt message\nCannot find a smaller prime");
      // re-prompt
      main(null);
    }
    // return the encrypted message
    return message;
  }

  /**
   * encrypts the first word
   * 
   * @param s
   * @return the encrypted word
   */
  public static int word1(String s) {
    // if the string isn't a valid number, return -1
    if (!isNum(s)) {
      return -1;
    }
    // convert the number to an integer and find its absolute value
    int n = Math.abs(Integer.parseInt(s));
    // take the square root and round it
    n = (int) (Math.sqrt(n) + 0.5);
    // take the absolute value after subtracting 50
    n = Math.abs(n - 50);
    return n;
  }

  /**
   * encrypts the second word
   * 
   * @param s
   * @return the encrypted word
   */
  public static String word2(String s) {
    // validate the string
    if (!valid(s)) {
      // output an error message
      System.out.println("Failed to encrypt message\nInvalid length in 1 or more words");
      // re-prompt
      main(null);
    }
    // if the length of the string is less than or equal to 3, return the original
    // string
    if (s.length() <= 3) {
      return s;
    }
    // return the rotated string
    return s.substring(4, s.length()) + s.substring(0, 4);
  }

  /**
   * encrypts the third word
   * 
   * @param s
   * @return the encrypted word
   */
  public static String word3(String s) {
    // if the length is less than one
    if (!valid(s)) {
      // output an error message
      System.out.println("Failed to encrypt message\nInvalid length in 1 or more words");
      // re-prompt
      main(null);
    }
    if (s.length() == 1) {
      return s;
    }
    // exchange the first and last character if the length is 2
    if (s.length() == 2) {
      return s.substring(1) + s.substring(0, 1);
    }
    // initialize the length into a variable to reduce the amount of function calls
    int length = s.length();
    // initialize the string
    String str = "";
    // shift the string
    for (int i = 1; i < length - 1; i++) {
      // if the character is "Y" or "Z", add "Z" and continue on the nest iteration
      if (Character.toUpperCase(s.charAt(i)) == 'Y' || Character.toUpperCase(s.charAt(i)) == 'Z') {
        str += "Z";
        continue;
      }
      // add the shifted character
      str += (char) (Character.toUpperCase(s.charAt(i)) + 2);
    }
    // exchange the first and last character character and output the encrypted
    // string
    return s.charAt(s.length() - 1) + str + s.charAt(0);
  }

  /**
   * encrypts the fourth word
   * 
   * @param s
   * @return the encrypted word
   */
  public static String word4(String s) {
    // validate the string
    if (!valid(s)) {
      // output an error message
      System.out.println("Failed to encrypt message\nInvalid length in 1 or more words");
      // re-prompt
      main(null);
    }
    // if the length of the string is 1, return the original string
    if (s.length() == 1) {
      return s;
    }
    // initialize the string
    String str = "";
    char first = s.charAt(0);
    // check for special characters/numbers
    if (!Character.isLetter(first)) {
      str += first;
    } else if (String.valueOf(first).equals(String.valueOf(first).toUpperCase())) {
      // check if the first character is a capital letter, if it is, add "$"
      str += "$";
    } else {
      // else add "&"
      str += "&";
    }
    // initialize the length into a variable to reduce the amount of function calls
    int length = s.length();
    // add the random number in place of the other characters except for the last
    // character
    int num = (int) (Math.random() * 10);
    for (int i = 0; i < length - 2; i++) {
      str += num;
    }
    char last = s.charAt(s.length() - 1);
    // check for special characters/numbers
    if (!Character.isLetter(last)) {
      str += last;
    } else if (String.valueOf(last).equals(String.valueOf(last).toUpperCase())) {
      // check if the last character is a capital letter, if it is, add "$"
      str += "$";
    } else {
      // else add "&"
      str += "&";
    }

    // return the encrypted string
    return str;
  }

  /**
   * encrypts the fifth word
   * 
   * @param s
   * @return the encrypted word
   */
  public static String word5(String s) {
    // validate the string
    if (!valid(s)) {
      // output an error message
      System.out.println("Failed to encrypt message\nInvalid length in 1 or more words");
      // reprompt
      main(null);
    }
    // replace all "n"s "xx" and the first "i" with "aa"
    return s.replace("n", "xx").replaceFirst("i", "aa");
  }

  /**
   * encrypts the sixth word
   * 
   * @param s
   * @return the encrypted word
   */
  public static int word6(String s) {
    // if the string isn't a valid number, return -1
    if (!isNum(s)) {
      return -1;
    }

    // ignore the negative sign
    if (s.charAt(0) == '-') {
      // add the rest of the string
      s = s.substring(1, s.length());
    }
    // raise 10 to the power of the length of the string, subtract 30000, and take
    // the absolute value
    return Math.abs((int) Math.pow(10, s.length()) - 30000);
  }

  /**
   * encrypts the seventh word
   * 
   * @param s
   * @return the encrypted word
   */
  public static int word7(String s) {
    // if the string isn't a valid number, return -1
    if (!isNum(s)) {
      return -1;
    }
    // convert the number to an integer and find its absolute value and store it in
    // n to reduce the number of function calls
    int n = Math.abs(Integer.parseInt(s));
    // check for the first prime number less than itself
    for (int i = n - 1; i > 0; i--) {
      if (isPrime(i)) {
        // return the square root of the number rounded
        return Math.abs((int) (Math.sqrt(i) + 0.5));
      }
    }
    // return -2 if there isnt a smaller prime
    return -2;

  }

  /**
   * checks if the number is prime
   * 
   * @param n
   * @return if the number is prime
   */
  public static boolean isPrime(int n) {
    if (n == 2) {
      // if the number is 2, return true
      return true;
    } else if (n == 1 || (n % 2 == 0)) {
      // if the number is 1 or even, return false
      return false;
    }

    // initialize the square root of the number to sqrt to reduce the number of
    // function calls
    double sqrt = (int) Math.sqrt(n);
    // if the number is odd, check if it is divisible by any number from 1 to the
    // square root of the number
    int divisors = 0;
    for (int i = 1; i <= sqrt; i += 2) {
      // check if the number is divisible
      if (n % i == 0) {
        // increment divisors
        divisors++;
      }
    }
    // there will only be 1 divisor (up ti the root of the number) if the number is
    // prime
    return divisors == 1;
  }

  /**
   * checks if the paramater is a valid number
   * 
   * @param s
   * @return if the parameter is a valid number
   */
  public static boolean isNum(String s) {
    // if the string is empty, return false
    if (s == null || s.equals("")) {
      return false;
    }
    // if the string is a number, return true
    try {
      // atempt to cast the strint
      Integer.parseInt(s);
      // it raises NumberFormatException if it fails to cast
    } catch (NumberFormatException e) {
      // so we can return false and assume the number isnt a valid integer
      return false;
    }
    // otherwise, we return true
    return true;
  }

  /**
   * checks the length of a string and determines if its valid
   * 
   * @param s
   * @return if the paramater is valid
   */
  public static boolean valid(String s) {
    // checks if the length is larger than 0
    return s.length() > 0;
  }
}