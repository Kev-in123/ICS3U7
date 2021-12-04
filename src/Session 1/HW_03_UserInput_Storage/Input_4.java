import java.util.Scanner;

public class Input_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter word #1: ");
        String word1 = s.nextLine();
        System.out.print("Please enter word #2: ");
        String word2 = s.nextLine();
        System.out.format("%s\n%s\n%s\t%s", word1, word2, word1, word2);
        s.close();
    }
}
