public class Food implements Summable
{
    private String name;
    private int calories;
    
    public Food(String name, int calories)
    {
        this.name = name;
        this.calories = calories;
    }
    
    public int getValue()
    {
        return this.calories;
    }
    
    public int add(Summable other)
    {
        return getValue() + other.getValue();
    }
}