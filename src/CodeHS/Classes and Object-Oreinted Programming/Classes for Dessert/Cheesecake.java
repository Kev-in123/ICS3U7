public class Cheesecake extends Cake
{
    private String recipe;
    
    public Cheesecake()
    {
        super("Cheesecake", 401);
        recipe = "2 pounds cream cheese (900 g), room temperature.\n"
        + "1 1/3 cup granulated sugar (270 g)\n"
        + "Pinch of salt.\n"
        + "2 teaspoons vanilla.\n"
        + "4 large eggs.\n"
        + "2/3 cup sour cream (160 ml)\n"
        + "2/3 cup heavy whipping cream (160 ml)";
    }
    
    public String getRecipe()
    {
        return recipe;
    }
}