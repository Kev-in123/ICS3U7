import java.util.Scanner;

public class Sentence {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String sentence = s.nextLine();
    System.out.println("The length is: " + sentence.length());
    System.out.println("Uppercase: " + sentence.toUpperCase());
    System.out.println("Lowercase " + sentence.toLowerCase());
    System.out.println("Letters from 3 to 6: " + sentence.substring(2, 6));
    System.out.println("Letters from 3 to the end: " + sentence.substring(2));
    System.out.println("Trimmed: " + sentence.strip());
    System.out.println("All \"i\" are replaced with \"xx\": " + sentence.replace("i","xx"));
    System.out.println("First \"cr\" are replaced with \"aa\": " + sentence.replaceFirst("cr", "aa"));
    s.close();
  }
}
