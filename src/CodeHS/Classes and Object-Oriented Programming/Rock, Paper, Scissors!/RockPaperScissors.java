public class RockPaperScissors extends ConsoleProgram
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
   private String getWinner(String user, String computer) {
        String USER_PLAYER = "User wins!";
        String COMPUTER_PLAYER = "Computer wins!";
        String TIE = "Tie";

        if ((user.equals("paper") && computer.equals("rock")) || ((user.equals("rock") && computer.equals("scissors"))) || ((user.equals("scissors") && computer.equals("paper")))) {
            return USER_PLAYER;
        }
        if ((computer.equals("paper") && user.equals("rock")) || ((computer.equals("rock") && user.equals("scissors"))) || ((computer.equals("scissors") && user.equals("paper")))) {
            return COMPUTER_PLAYER;
        }
        return TIE;
    }
    
    public void run() {
        Randomizer random = new Randomizer();
        String comp = "";
        int n;
        String input = readLine("Enter your choice (rock, paper, or scissors):"); 
        while (!input.equals("")) {
             n = random.nextInt(0, 2);
            if (n == 0) {
                comp = "rock";
            } else if (n == 1) {
                comp = "scissors";
            } else if (n == 2) {
                comp = "paper";
            }
            
            System.out.println("User: " + input);
            System.out.println("Computer: " + comp);
            System.out.println(getWinner(input, comp));
            input = readLine("Enter your choice (rock, paper, or scissors):"); 
        }
        System.out.println("Thanks for playing!");
    }
}