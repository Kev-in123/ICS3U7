public class Fraction
{
    int numerator;
    int denominator;
    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    public void setNumerator(int x) {
        numerator = x;
    }
    
    public void setDenominator(int x) {
        denominator = x;
    }
}