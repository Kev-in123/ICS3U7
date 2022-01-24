public class Fraction implements Comparable<Fraction>
{
    double numerator;
    double denominator;
    
    Fraction(double n, double d) {
        numerator = n;
        denominator = d;
    }
    
    public int compareTo(Fraction other) {
        double diff = numerator/denominator - other.numerator/other.denominator;
        return (int) Math.signum(diff);
    }
    
    public boolean equals(Object other) {
        return other instanceof Fraction && compareTo((Fraction) other) == 0;
    }
}