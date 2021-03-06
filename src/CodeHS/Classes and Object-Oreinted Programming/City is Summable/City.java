public class City implements Summable
{
    private int population;
    private String name;

    public City(String name, int population)
    {
        this.name = name;
        this.population = population;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int add(Summable other) {
        return this.population + other.getValue();
    };
    
    public int getValue() {
        return population;
    };
}