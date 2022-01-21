public class Sweatshirt extends Clothing {
    boolean hasHood;
    Sweatshirt(String s, String c, boolean h) {
        size = s;
        colour = c;
        hasHood = h;
    }
    public boolean hasHood() {
        return hasHood;
    }
}