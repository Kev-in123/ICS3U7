public class Unicode {
  public static void main(String[] args) {
    System.out.println("Unicode\tCharacter");
    int ch = 1;
    do {
      System.out.println(ch + "\t" + (char) ch);
      ch++;
    } while (ch <= 212);
  }
}
