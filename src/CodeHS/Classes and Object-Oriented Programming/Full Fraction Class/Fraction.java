public class Fraction
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;
    public Fraction (int n, int d) {
        numerator = n;
        denominator = d;
    }
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return numerator;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denominator;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        numerator = x;
    }
    
     
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        denominator = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        int temp = denominator;
        if (denominator != other.getDenominator()) {
            denominator *= other.getDenominator();
            numerator *= other.getDenominator();
        }
        numerator += other.getNumerator()*temp;
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        int temp = denominator;
        if (denominator != other.getDenominator()) {
            denominator *= other.getDenominator();
            numerator *= other.getDenominator();
        }
        numerator -= other.getNumerator()*temp;
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        denominator *= other.getDenominator();
        numerator *= other.getNumerator();
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return numerator + "/" + denominator;

    }
}