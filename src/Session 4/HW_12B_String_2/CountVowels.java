import java.util.Scanner;

public class CountVowels {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter text: ");
    String text = s.nextLine();
    System.out.println("The number of vowels is " + countVowels(text));
    s.close();  
  }
  public static int countVowels(String str) {
    int count = 0;
    char c;
    for (String i: str.split("")) {
        c = i.charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            count++;
        }
    }
    return count;
  }
}
