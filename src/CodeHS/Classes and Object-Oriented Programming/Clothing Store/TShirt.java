public class TShirt extends Clothing
{
    String fabric;
    TShirt (String s, String c, String f) {
        size = s;
        colour = c;
        fabric = f;
    }
    public String getFabric() {
        return fabric;
    }
    
}