public class SumTester extends ConsoleProgram
{
    public void run()
    {
        Food cookie = new Food("Coookie", 132);
        Food taco = new Food("Taco", 156);
        
        int totalCalories = cookie.add(taco);
        System.out.println("Total calories in foods: " + totalCalories);
        
        Book tomSawyer = new Book("Tom Sawyer", 224);
        Book odyssey = new Book("The Odyssey", 560);
        
        int totalPages = tomSawyer.add(odyssey);
        System.out.println("Total pages read: " + totalPages);
    }
}