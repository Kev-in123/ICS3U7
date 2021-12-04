import java.util.Scanner;

public class Input_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = s.nextLine();
        System.out.print("How old are you? ");
        byte age = s.nextByte();        
        System.out.format("So you are %s and you are %s", name, age);
        s.close();
    }
}    
