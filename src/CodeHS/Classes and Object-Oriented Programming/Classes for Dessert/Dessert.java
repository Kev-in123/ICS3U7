public class Dessert
{
    private int calories;
    private String name;
    
    public Dessert(String name, int calories)
    {
        this.name = name;
        this.calories = calories;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getCalories()
    {
        return this.calories;
    }
}