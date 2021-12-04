import java.util.Scanner;

public class Taxi {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the amount of passengers: ");
    int numOfPassengers = s.nextInt();
    float roundedTaxis = (float) numOfPassengers/4;
    int taxisNeeded = (int) (roundedTaxis + 0.5);
    System.out.format("You will need %d taxis", taxisNeeded);
    s.close();
  }
}
