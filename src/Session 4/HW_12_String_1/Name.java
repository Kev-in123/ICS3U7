import java.util.Scanner;

public class Name {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String name_i = s.nextLine();
    System.out.println(name(name_i));
    s.close();
  }

  public static String name(String s) {
    String[] words = s.split(" ");
    for (int i = 0; i < words.length; i++) {
      words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
    }
    String result = "";
    for (int i = 0; i < words.length; i++) {
      result += words[i] + " ";
    }
    return result;
  }
}
