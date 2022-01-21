public class Book implements Summable
{
    private int numPages;
    private String title;
    
    public Book(String title, int numPages)
    {
        this.title = title;
        this.numPages = numPages;
    }
    
    public int getValue()
    {
        return this.numPages;
    }
    
    public int add(Summable other)
    {
        return getValue() + other.getValue();
    }
}