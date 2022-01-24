public class PoundCake extends Cake
{
    private String recipe;
    
    public PoundCake()
    {
        super("Pound Cake", 109);
        recipe = "1/2 pound (2 sticks) butter, plus more for pan\n"
                +   "1/2 cup vegetable shortening\n"
                +   "3 cups sugar\n"
                +   "5 eggs\n"
                +   "3 cups all-purpose flour, plus more for pan\n"
                +   "1/2 teaspoon fine salt\n"
                +   "1/2 teaspoon baking powder\n"
                +   "1 cup milk\n"
                +   "1 teaspoon vanilla extract\n";
    }
    
    public String getRecipe()
    {
        return recipe;
    }
}