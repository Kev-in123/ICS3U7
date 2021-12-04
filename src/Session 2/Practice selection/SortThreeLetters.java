import java.util.*;

public class SortThreeLetters {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    char letter1 = s.next(".").charAt(0);
    char letter2 = s.next(".").charAt(0);
    char letter3 = s.next(".").charAt(0);
    char[] letters = {letter1, letter2, letter3};
    if (Character.toLowerCase(letter1) == letter1 && Character.toLowerCase(letter2) == letter2 && Character.toLowerCase(letter3) == letter3) {
      Arrays.sort(letters);
      for (char letter: letters) {
        System.out.println(letter);
      }
      
    }
    s.close();
  }
}
