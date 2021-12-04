import java.util.Scanner;

public class Question7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double ticket_price = 64.97;
    System.out.print("How much money do you have: ");
    double money_amount = s.nextDouble();
    int ticket_number = (int) (money_amount / ticket_price);
    int change_dollars = (int) (money_amount - ticket_number * ticket_price);
    int change_cents = (int) money_amount - change_dollars;
    System.out.format("with %.2f dollars, you can buy %d tickets.\nThe change is %d dollars and %d cents.",
        money_amount, ticket_number, change_dollars, change_cents);
    s.close();
  }
}
