import java.util.Scanner;

public class Input_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = s.nextLine();
        System.out.format("\nHello %s", name);
        s.close();
    }
}