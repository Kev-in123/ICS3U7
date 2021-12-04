import java.util.Scanner;

public class Guessing {
  public static void main(String[] args) {
    int rand_num = (int) (Math.random() * 20) + 1;
    Scanner s = new Scanner(System.in);
    System.out.println("The computer has picked a number from 1 to 20, try and guess it");
    int guess = 0;
    int tries = 0;
    while (guess != rand_num) {
      tries += 1;
      System.out.print("Enter your guess: ");
      guess = s.nextInt();
      if (guess > rand_num) {
        System.out.println("Your guess was high");
      } else if (guess < rand_num) {
        System.out.println("Your guess was low");
      }
    }
    if (tries == 1) {
      System.out.println("Congratulations, you guessed it in 1 try!");
    } else {
      System.out.format("Congratulations, you guessed it in %d tries!", tries);
    }
    s.close();
  }
}
