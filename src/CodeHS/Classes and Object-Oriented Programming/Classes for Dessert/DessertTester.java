public class DessertTester extends ConsoleProgram
{
    private void printDivider()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.print("=");
        }
        System.out.println();
    }
    
    public void run()
    {
        Cheesecake cheesecake = new Cheesecake();
        System.out.println(cheesecake.getName());
        printDivider();
        System.out.println(cheesecake.getRecipe());
        
        System.out.println();
        
        PoundCake poundcake = new PoundCake();
        System.out.println(poundcake.getName());
        printDivider();
        System.out.println(poundcake.getRecipe());
        
        ApplePie pie = new ApplePie(10);
        System.out.println(pie);
        pie.eatSlice();
        pie.eatSlice();
        System.out.println(pie);
        
        System.out.println();
        printDivider();
        
        ChocolateChipCookie cookie = new ChocolateChipCookie();
        System.out.println(cookie.getName());
        System.out.println(cookie.getCalories());
    }
}