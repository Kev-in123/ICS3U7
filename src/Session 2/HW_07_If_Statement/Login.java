
public class Login {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    final int userID = 99;
    final int password = 99;
    int inputID = s.nextInt();
    int inputPassword = s.nextInt();
    if (inputID == userID && inputPassword == password) {
      System.out.println("Access granted");
    } else {
      System.out.println("Incorrect username or password");
    }
    s.close();
  }
}
