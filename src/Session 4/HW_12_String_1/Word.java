import java.util.Scanner;

public class Word {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String word = s.next();
    System.out.println("First 4 letters are: " + word.substring(0, 4) 
                   + "\nLast 4 letters are: " + word.substring(4, word.length()));
    s.close();
  }
}
