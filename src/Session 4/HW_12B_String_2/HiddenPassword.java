import java.util.Scanner;

public class HiddenPassword {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a password: ");
    String password = s.nextLine();
    System.out.print("Enter a character: ");
    String character = s.nextLine();
    System.out.print("Hidden password: " + passwordHider(password, character));
    s.close();
  }
  public static String passwordHider(String password, String character) {
    String hidden = "";
    for (int i = 0; i < password.length(); i++) {
      if (password.charAt(i) == ' ') {
        hidden += " ";
        continue;
      }
      hidden += character;
    }
    return hidden;
  }
}
